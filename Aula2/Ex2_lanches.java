package Aula2;
import java.util.Scanner;

public class Ex2_lanches {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de lanches comidos na primeira hora:");
        int hora1 = entrada.nextInt();
        System.out.print("Digite a quantidade de lanches comidos na segunda hora:");
        int hora2 = entrada.nextInt();
        System.out.print("Digite a quantidade de lanches comidos na terceira hora:");
        int hora3 = entrada.nextInt();

        entrada.close();

        int total = hora1 + hora2 + hora3;

        System.out.println("Total de lanches comidos: " + total);
        System.out.println("Media de lanches comidos: " + total/3);

    }
}

