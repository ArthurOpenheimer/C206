package Aula3;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double litro, preco, desconto, total;
        char tipo;

        System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina): ");
        tipo = entrada.next().charAt(0);
        System.out.print("Digite a quantidade de litros: ");
        litro = entrada.nextFloat();

        entrada.close();

        if(tipo == 'A'){
            if(litro <= 20){
                preco = 4.90;
                desconto = 0.03;       
            }
            else{
                preco = 4.90;
                desconto = 0.05;         
            }
            total = (preco - (preco * desconto)) * litro;
             System.out.println("Total a pagar: " + total);   
        }
        else if(tipo == 'G'){
            if(litro <= 20){
                preco = 6.00;
                desconto = 0.04;       
            }
            else{
                preco = 6.00;
                desconto = 0.06;         
            }
            total = (preco - (preco * desconto)) * litro;
             System.out.println("Total a pagar: " + total);   
        }
    }
}
