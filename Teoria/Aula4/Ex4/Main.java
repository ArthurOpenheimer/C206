package Aula4.Ex4;

public class Main {
    
    public static void main(String[] args) {
        
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 200;

        System.out.println("Vida do zumbi zumbi1: " + zumbi1.vida);
        System.out.println("Vida do zumbi zumbi2: " + zumbi2.vida);

        if(zumbi1.transfereVida(zumbi2, 50)){
            System.out.println("Transferindo de zumbi1 para zumbi2");
            System.out.println("Vida do zumbi zumbi1: " + zumbi1.vida);
            System.out.println("Vida do zumbi zumbi2: " + zumbi2.vida);
        }

        if(zumbi1.transfereVida(zumbi2, 150)){
            System.out.println("Transferindo de zumbi1 para zumbi2");
            System.out.println("Vida do zumbi zumbi1: " + zumbi1.vida);
            System.out.println("Vida do zumbi zumbi2: " + zumbi2.vida);
        }
        else{
            System.out.println("A vida não foi alterada!!!");
        }
    }
}
