package Estudo.AV3_L4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Veiculo> veiculos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        int opcao = 0;
        
        do{
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Listar veículos por ano decrescente");
            System.out.println("4 - Listar quantidade de veículos por marca");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    Veiculo veiculo = new Veiculo();
                    System.out.print("Digite a marca do veículo: ");
                    String marca = sc.nextLine();
                    try {
                        if(!marca.equals("Rolls-Royce") && !marca.equals("Bentley")){
                            throw new ValorInvalidoException("Nenhum veículo deve ser salvo com marca diferente de Rolls-Royce e Bentley!");
                        }
                        else{
                            veiculo.setMarca(marca);
                        }
                    } catch(ValorInvalidoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.print("Digite o modelo do veículo: ");
                    veiculo.setModelo(sc.nextLine());
                    System.out.print("Digite o ano do veículo: ");
                    int ano = sc.nextInt();
                    try {
                        if(ano < 1960 || ano > 2024){
                            throw new ValorInvalidoException("Nenhum veículo deve ser salvo com ano menor que 1960 ou maior que 2024!");
                        }
                        else{
                            veiculo.setAno(ano);
                            sc.nextLine();
                        }
                    } catch(ValorInvalidoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.print("Digite a quilometragem do veículo: ");
                    double KmRodados = sc.nextDouble();
                    try{
                        if(KmRodados < 0){
                            throw new ValorInvalidoException("Nenhum veículo deve ser salvo com quilometragem negativa!");
                        }
                        else{
                            veiculo.setKmRodados(KmRodados);
                        }
                    } catch(ValorInvalidoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.print("Digite a potência do motor do veículo: ");
                    int potencia = sc.nextInt();
                    try {
                        if(potencia <= 0){
                            throw new ValorInvalidoException("Nenhum veículo deve ser salvo com potência negativa ou nula!");
                        }
                        else{
                            veiculo.motor.setPotencia(potencia);
                            sc.nextLine();
                        }
                    } catch(ValorInvalidoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.print("Digite o número de cilindros do veículo: ");
                    int numCilindros = sc.nextInt();
                    try {
                        if(numCilindros <= 0){
                            throw new ValorInvalidoException("Nenhum veículo deve ser salvo com numero de cilindros negativa ou nula!");
                        }
                        else{
                            veiculo.motor.setNumCilindros(numCilindros);
                            sc.nextLine();
                        }
                    } catch(ValorInvalidoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    arquivo.escrever(veiculo);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;
                case 2:
                    veiculos = arquivo.ler();

                    for(Veiculo v : veiculos){
                        v.mostrarInfos();
                    }
                    break;
                case 3:
                    veiculos = arquivo.ler();
                    Collections.sort(veiculos);
                    Collections.reverse(veiculos);

                    for(Veiculo v : veiculos){
                        v.mostrarInfos();
                    }
                    break;
                case 4:
                    veiculos = arquivo.ler();
                    int qtdRolls = 0;
                    int qtdBentley = 0;

                    for(Veiculo v : veiculos){
                        if(v.getMarca().equals("Rolls-Royce")){
                            qtdRolls++;
                        }
                        else if(v.getMarca().equals("Bentley")){
                            qtdBentley++;
                        }
                    }

                    System.out.println("Quantidade de veículos Rolls-Royce: " + qtdRolls);
                    System.out.println("Quantidade de veículos Bentley: " + qtdBentley);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        }while(opcao!=5);
    }
}
