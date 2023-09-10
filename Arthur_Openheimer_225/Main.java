package Arthur_Openheimer_225;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Academia academia = new Academia();
        academia.nome = "Academia do Arthur";
        academia.numTelefone = "999999999";

        int opcao = 0;

        do{
            System.out.println();
            System.out.println("1 - Adicionar equipamento");
            System.out.println("2 - Mostrar informacoes da academia e de todos os equipamentos");
            System.out.println("3 - Mostrar quantidade e % de equipamentos em manutencao");
            System.out.println("4 - Mostrar informacoes do equipamento mais caro e mais barato");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Equipamento equipamento = new Equipamento();
                    System.out.println("Digite o numero de serie: ");
                    equipamento.numSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome: ");
                    equipamento.nome = sc.nextLine();
                    System.out.println("Digite a marca: ");
                    equipamento.marca = sc.nextLine();
                    System.out.println("Digite o valor de aquisicao: ");
                    equipamento.valorAquisicao = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o status (Funcionamento ou Manutencao): ");
                    equipamento.status = sc.nextLine();
                    academia.cadastrarEquipamento(equipamento);
                    break;
                case 2:
                    academia.mostrarInfos();
                    break;
                case 3:
                    academia.infosEquipamentoManutencao();
                    break;
                case 4:
                    academia.mostrarMaisCaroMaisBarato();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }
}

