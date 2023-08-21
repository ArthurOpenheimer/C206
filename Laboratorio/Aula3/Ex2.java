package Aula3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double np1, np2, media;

        System.out.print("Digite a nota da NP1: ");
        np1 = entrada.nextDouble();
        System.out.println("Digite a nota da NP2: ");
        np2 = entrada.nextDouble();

        entrada.close();

        media = (np1 + np2) / 2;

        System.out.println("Média final: " + (int) media);
    }
}
