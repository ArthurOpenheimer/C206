package Aula3;
import java.util.Scanner;
import java.util.Random;

public class Ex6_random2 {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = random.nextInt(10) + 1;
        int guess;

        do{
            System.out.print("Digite um numero entre 1 e 10:");
            
            guess = entrada.nextInt();

            if(guess < x){
                System.out.println("O numero é maior que " + guess);
            }
            else if(guess > x){
                System.out.println("O numero é menor que " + guess);
            }
        }while(guess != x);

        entrada.close();

        System.out.println("Parabéns! Você acertou!");
    }
}
