package PCMania;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Arthur";
        cliente.cpf = 123456789;
        cliente.carrinho = new Computador[10];

        MemoriaUSB memoria1 = new MemoriaUSB();
        memoria1.nome = "Pendrive";
        memoria1.capacidade = 16;
        
        Computador promocao1 = new Computador();
        promocao1.marca = "Positivo";
        promocao1.preco = 2300;
        promocao1.sistemaOperacional.nome = "Linux Ubuntu";
        promocao1.sistemaOperacional.tipo = 32;
        promocao1.hardwareBasico[0].nome = "Pentium Core i3";
        promocao1.hardwareBasico[0].capacidade = 2200;
        promocao1.hardwareBasico[1].nome = "Memória RAM";
        promocao1.hardwareBasico[1].capacidade = 8;
        promocao1.hardwareBasico[2].nome = "HD";
        promocao1.hardwareBasico[2].capacidade = 500;

        promocao1.addMemoriaUSB(memoria1);


        MemoriaUSB memoria2 = new MemoriaUSB();
        memoria2.nome = "Pendrive";
        memoria2.capacidade = 32;

        Computador promocao2 = new Computador();
        promocao2.marca = "Acer";
        promocao2.preco = 5800;
        promocao2.sistemaOperacional.nome = "Windows 8";
        promocao2.sistemaOperacional.tipo = 64;
        promocao2.hardwareBasico[0].nome = "Pentium Core i5";
        promocao2.hardwareBasico[0].capacidade = 3370;
        promocao2.hardwareBasico[1].nome = "Memória RAM";
        promocao2.hardwareBasico[1].capacidade = 16;
        promocao2.hardwareBasico[2].nome = "HD";
        promocao2.hardwareBasico[2].capacidade = 1000;

        promocao2.addMemoriaUSB(memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB();
        memoria3.nome = "HD Externo";
        memoria3.capacidade = 1000;


        Computador promocao3 = new Computador();
        promocao3.marca = "Vaio";
        promocao3.preco = 1800;
        promocao3.sistemaOperacional.nome = "Windows 10";
        promocao3.sistemaOperacional.tipo = 64;
        promocao3.hardwareBasico[0].nome = "Pentium Core i7";
        promocao3.hardwareBasico[0].capacidade = 4500;
        promocao3.hardwareBasico[1].nome = "Memória RAM";
        promocao3.hardwareBasico[1].capacidade = 32;
        promocao3.hardwareBasico[2].nome = "HD";
        promocao3.hardwareBasico[2].capacidade = 2000;

        promocao3.addMemoriaUSB(memoria3);

        
        System.out.println("PCMania");
        System.out.println();
        System.out.println("Promoções: ");
        System.out.println();
        System.out.println("1 - Promoção 1");
        promocao1.mostraPCConfigs();
        System.out.println();
        System.out.println("2 - Promoção 2");
        promocao2.mostraPCConfigs();
        System.out.println();
        System.out.println("3 - Promoção 3");
        promocao3.mostraPCConfigs();
        System.out.println();
        System.out.println("0 - Finalizar compra e sair");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        int aux = 0;

        do{
            System.out.println("Digite o número da promoção desejada para adicioná-la ao carrinho: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    cliente.carrinho[aux] = promocao1;
                    aux++;
                    System.out.println("Promoção 1 adicionada ao carrinho");
                    break;
                case 2:
                    cliente.carrinho[aux] = promocao2;
                    aux++;
                    System.out.println("Promoção 2 adicionada ao carrinho");
                    break;
                case 3:
                    cliente.carrinho[aux] = promocao3;
                    aux++;
                    System.out.println("Promoção 3 adicionada ao carrinho");
                    break;
                case 0:
                    System.out.println("Compra finalizada");
                    System.out.println("Cliente: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println();
                    System.out.println("Computadores comprados: ");
                    for(int i = 0; i < aux; i++){
                        if(cliente.carrinho[i] != null){
                            cliente.carrinho[i].mostraPCConfigs();
                        }
                            System.out.println();
                    }
                    System.out.println("Total da compra: " + cliente.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 0);

        scanner.close();
    }
}
