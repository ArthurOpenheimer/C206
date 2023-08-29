package Aula5.Ex2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        boolean field[][] = new boolean[2][2];
        int bombX = rand.nextInt(2);
        int bomY = rand.nextInt(2);

        field[bombX][bomY] = true;

        System.out.println("LESGOOO");

        boolean result = false;

        while(result == false) {
            System.out.print("Entre com X: ");
            int x = input.nextInt();
            System.out.print("Entre com Y: ");
            int y = input.nextInt();

            if(field[x][y] == true) {
                System.out.println("KABOOM");
                result = true;
            }
            else {
                System.out.println("SAFE");
            }
        }

        System.out.println("GAME OVER");
        input.close();
    }
}
