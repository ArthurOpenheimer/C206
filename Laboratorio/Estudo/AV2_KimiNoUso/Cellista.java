package Estudo.AV2_KimiNoUso;

public class Cellista extends Musico implements Som {
    
    private boolean sentado;

    @Override
    public void tocar(){
        System.out.println("O cellista " + this.nome + " está tocando " + this.musica);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Sentado: " + this.sentado);
    }

    @Override
    public void desafinar(){
        this.pontuacao -= this.pontuacao * 0.05;
        System.out.println("O cellista " + this.nome + " desafinou e perdeu 5% da pontuação");
    }
}