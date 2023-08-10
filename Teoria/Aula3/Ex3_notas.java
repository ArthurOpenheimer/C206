package Aula3;
import java.util.Scanner;

public class Ex3_notas {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        System.out.print("Digite a nota NPA:");
        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Parabéns! Você foi aprovado sem NP3");
        }
        else{
            System.out.println("Ainda há chances. Rumo a NP3");
            System.out.print("Digite a nota NP3:");
            np3 = entrada.nextInt();

            if((np3 + npa)/2 >= 50){
                System.out.println("AEEE APROVADO(A)!");
            }
            else{
                System.out.println("Deu ruim, até semestre que vem");
            }
        }

        entrada.close();

    }
}