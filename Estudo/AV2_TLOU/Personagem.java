package Estudo.AV2_TLOU;

public abstract class Personagem {

    private static int numPersonagem = 0;
    private int vida;
    private int idPersonagem;

    Personagem() {
        numPersonagem++;
        this.idPersonagem = numPersonagem;
    }

    public void mostrarInfos(){
        System.out.println("ID: " + this.idPersonagem);
        System.out.println("Vida: " + this.vida);
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getNumPersonagem() {
        return numPersonagem;
    }
}
