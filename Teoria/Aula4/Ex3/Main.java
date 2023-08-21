package Aula4.Ex3;

public class Main {
    
    public static void main(String[] args) {
        
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 200;

        System.out.println("Vida do zumbi zumbi1: " + zumbi1.vida);
        System.out.println("Vida do zumbi zumbi2: " + zumbi2.vida);

        zumbi1 = zumbi2;

        System.out.println("zumbi1 = zumbi2");
        System.out.println("Vida do zumbi zumbi1: " + zumbi1.vida);
        System.out.println("Vida do zumbi zumbi2: " + zumbi2.vida);
    }
}
