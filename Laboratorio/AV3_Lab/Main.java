package AV3_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //cria um arraylist de livros, um scanner para leitura de dados e um arquivo para manipulação de arquivos
        ArrayList<Livro> livros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        int opcao = 0; //variável que armazena a opção escolhida pelo usuário
        
        do{
            //menu
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Listar livros por preço crescente");
            System.out.println("4 - Listar porcentagem de livros por editora");
            System.out.println("5 - Sair" + "\n");

            opcao = sc.nextInt(); //lê a opção escolhida pelo usuário
            sc.nextLine();

            switch(opcao){
                case 1: //cadastra um livro
                    Livro livro = new Livro();
                    System.out.print("Digite o título do livro: ");
                    livro.setTitulo(sc.nextLine());

                    System.out.print("Digite o preço do livro: ");
                    double preco = sc.nextDouble();
                    try { //trata exceções pois nenhum livro pode ter seu preço negativo ou nulo
                        if(preco <= 0){
                            throw new DadoInvalidoException("Nenhum livro pode ter seu preço negativo ou nulo!");
                        }
                        else{
                            livro.setPreco(preco);
                            sc.nextLine();
                        }
                    } catch (DadoInvalidoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.print("Digite o gênero literário do livro: ");
                    livro.setGenLiterario(sc.nextLine());
                    
                    System.out.print("Digite a quantidade de folhas do livro: ");
                    int qtdFolhas = sc.nextInt();
                    try { //trata exceções pois nenhum livro pode ter sua quantidade de folhas negativa ou nula
                        if(qtdFolhas <= 0){
                            throw new DadoInvalidoException("Nenhum livro pode ter sua quantidade de folhas negativa ou nula!");
                        }
                        else{
                            livro.setQtdFolhas(qtdFolhas);
                            sc.nextLine();
                        }
                    } catch (DadoInvalidoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.print("Digite a editora do livro: ");
                    String editora = sc.nextLine();
                    try { //trata exceções pois só podem ser cadastrados livros das editoras NYBooks ou DGBooks
                        if(!editora.equals("NYBooks") && !editora.equals("DGBooks")){
                            throw new DadoInvalidoException("Cadastre apenas livros das editoras NYBooks ou DGBooks!");
                        }
                        else{
                            livro.setEditora(editora);
                        }
                    } catch (DadoInvalidoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.print("Digite o ano de lançamento do livro: ");
                    int anoLancamento = sc.nextInt();
                    try { //trata exceções pois nenhum livro pode ter seu ano de lançamento menor que 2000 ou maior que 2023
                        if(anoLancamento < 2000 || anoLancamento > 2023){
                            throw new DadoInvalidoException("Nenhum livro pode ter seu ano de lançamento menor que 2000 ou maior que 2023!");
                        }
                        else{
                            livro.setAnoLancamento(anoLancamento);
                            sc.nextLine();
                        }
                    } catch (DadoInvalidoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    arquivo.escrever(livro); //escreve o livro no arquivo
                    break;
                case 2: //lista todos os livros cadastrados
                    livros = arquivo.ler(); //usa o método ler() da classe Arquivo para ler os livros do arquivo e armazená-los no arraylist livros

                    for(Livro l : livros){
                        l.mostrarInfo();
                    }
                    break;
                case 3: //lista todos os livros cadastrados em ordem crescente de preço
                    livros = arquivo.ler(); //usa o método ler() da classe Arquivo para ler os livros do arquivo e armazená-los no arraylist livros
                    
                    Collections.sort(livros);

                    for(Livro l : livros){
                        l.mostrarInfo();
                    }
                    break;
                case 4: //lista a porcentagem de livros cadastrados por editora
                    livros = arquivo.ler();
                    int totalLivros = livros.size();
                    int totalNYBooks = 0; //variável que armazena a quantidade de livros da editora NYBooks
                    int totalDGBooks = 0; //variável que armazena a quantidade de livros da editora DGBooks

                    for(Livro l : livros){
                        if(l.getEditora().equals("NYBooks")){
                            totalNYBooks++;
                        }
                        else{
                            totalDGBooks++;
                        }
                    }

                    //casting para double para que a divisão seja feita com números decimais
                    System.out.println("Porcentagem de livros da NYBooks: " + ((double)totalNYBooks/totalLivros)*100 + "%");
                    System.out.println("Porcentagem de livros da DGBooks: " + ((double)totalDGBooks/totalLivros)*100 + "%" + "\n");
                    break;
                case 5: //sai do programa
                    System.out.println("Saindo...");
                    break;
            }
        }while(opcao != 5);
   
    }
}
