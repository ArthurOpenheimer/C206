package Aula15;

public class Contador2 implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("[Contador 2] " + i + "");
        }
    }
}
