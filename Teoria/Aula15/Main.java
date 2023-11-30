package Aula15;

public class Main {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Contador1());
        Thread t2 = new Thread(new Contador2());
        Thread t3 = new Thread(new Contador3());
        
        t1.start();
        t2.start();
        t3.start();
    }
}
