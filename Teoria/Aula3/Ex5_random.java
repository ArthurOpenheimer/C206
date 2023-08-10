package Aula3;
import java.util.Scanner;
import java.util.Random;

public class Ex5_random {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = random.nextInt(10) + 1;
        int guess;

        do{
            System.out.print("Digite um numero entre 1 e 10:");
            guess = entrada.nextInt();
            System.out.println("Errou!");
        }while(guess != x);

        entrada.close();

        System.out.println("Parabéns! Você acertou!");
    }
}
