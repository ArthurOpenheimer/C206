package Aula3;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char op;
        double n1, n2, res;


        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextDouble();
        System.out.print("Digite a operação: (+, -, x, /, ^) ");
        op = entrada.next().charAt(0);

        entrada.close();

        switch (op) {
            case '+':
                res = n1 + n2;
                System.out.println("Resultado: " + res);
                break;
            case '-':
                res = n1 - n2;
                System.out.println("Resultado: " + res);
                break;
            case 'x':
                res = n1 * n2;
                System.out.println("Resultado: " + res);
                break;
            case '/':
                res = n1 / n2;
                System.out.println("Resultado: " + res);
                break;
            case '^':
                res = Math.pow(n1, n2);
                System.out.println("Resultado: " + res);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}
