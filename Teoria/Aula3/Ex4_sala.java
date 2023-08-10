package Aula3;
import java.util.Scanner;

public class Ex4_sala {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numAlunos;

        System.out.print("Digite o numero de alunos:");
        numAlunos = entrada.nextInt();

        entrada.close();
        
        switch(numAlunos){
            case 10:
                System.out.println("Aula ministrada na sala 1-16");
                break;
            case 20:
                System.out.println("Aula ministrada na sala 1-16");
                break;
            case 30:
                System.out.println("Aula ministrada na sala 1-22");
                break;
            default:
                System.out.println("Apenas 10, 20 ou 30 alunos");
        }
    }
}