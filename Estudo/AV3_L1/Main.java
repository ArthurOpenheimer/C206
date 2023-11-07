package Estudo.AV3_L1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Filme> filmes = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        int opcao = 0;

        do {
            System.out.println("1 - Cadastrar filmes");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Ordenar os filmes de A-Z");
            System.out.println("4 - Ordenar os filmes Z-A");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Filme filme = new Filme();
                    System.out.print("Digite o nome do filme: ");
                    filme.setNomeFilme(sc.nextLine());
                    System.out.print("Digite o gênero do filme: ");
                    filme.setGeneroFilme(sc.nextLine());
                    System.out.print("Digite a duração do filme: ");
                    int duracao = sc.nextInt();
                    try {
                        if (duracao <= 0) {
                            throw new DuracaoNegativaException("Nenhum filme deve ser salvo com duração menor ou igual a zero! ");
                        }
                        else{
                            filme.setDuracaoMin(duracao);
                        }
                    } catch (DuracaoNegativaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    arquivo.escrever(filme);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;
                case 2:
                    filmes = arquivo.ler();

                    for(Filme f : filmes){
                        System.out.println("Nome: " + f.getNomeFilme());
                        System.out.println("Gênero: " + f.getGeneroFilme());
                        System.out.println("Duração: " + f.getDuracaoMin());
                    }
                    break;
                case 3:
                    filmes = arquivo.ler();
                    Collections.sort(filmes);

                    for (Filme f : filmes) {
                        System.out.println("Nome: " + f.getNomeFilme());
                        System.out.println("Gênero: " + f.getGeneroFilme());
                        System.out.println("Duração: " + f.getDuracaoMin());
                    }
                    break;
                case 4:
                    filmes = arquivo.ler();
                    Collections.sort(filmes);
                    Collections.reverse(filmes);

                    for (Filme f : filmes) {
                        System.out.println("Nome: " + f.getNomeFilme());
                        System.out.println("Gênero: " + f.getGeneroFilme());
                        System.out.println("Duração: " + f.getDuracaoMin());
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

            }
        } while (opcao != 5); 
    }
}