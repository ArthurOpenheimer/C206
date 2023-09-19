package Aula8.Arkanoid;

public class Bloco {
    private static int numBlocos = 0;

    public Bloco() {
        numBlocos++;
    }

    public void destruir(){
        System.out.println("Bloco sendo destruido!");
        numBlocos--;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }
}
