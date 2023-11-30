package Estudo.AV1_L1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado();
        supermercado.nome = "Supermercado do João";
        supermercado.cnpj = "123456789";
        supermercado.endereco = "Rua 1, 123";
        supermercado.numTelefone = "123456789";

        int opcao = 0;
        
        do{
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Contar categorias");
            System.out.println("4 - Mostrar mais caro e mais barato");
            System.out.println("5 - Sair");
            
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    Produto p = new Produto();
                    System.out.println("Digite o código de série: ");
                    p.codigoSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome: ");
                    p.nome = sc.nextLine();
                    System.out.println("Digite a categoria: ");
                    p.categoria = sc.nextLine();
                    System.out.println("Digite a quantidade: ");
                    p.quantidade = sc.nextInt();
                    System.out.println("Digite o valor: ");
                    p.valor = sc.nextDouble();
                    supermercado.addProduto(p);
                    break;
                case 2:
                    System.out.println("Nome: " + supermercado.nome);
                    System.out.println("CNPJ: " + supermercado.cnpj);
                    System.out.println("Endereço: " + supermercado.endereco);
                    System.out.println("Número de telefone: " + supermercado.numTelefone);
                    for(int i = 0; i < supermercado.produtos.length; i++){
                        if(supermercado.produtos[i] == null){
                            break;
                        }
                        supermercado.produtos[i].mostrarInfos();
                    }
                    break;
                case 3:
                    supermercado.contarCategorias();
                    break;
                case 4:
                    supermercado.mostrarMaisCaroBarato();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 5);

        sc.close();
    }
}
