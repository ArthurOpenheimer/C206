package Estudo.AV2_KimiNoUso;

public class Pianista extends Musico implements Tecnica, Tempo {
    
    private float alturaBanco;

    @Override
    public void tocar(){
        System.out.println("O pianista " + this.nome + " está tocando " + this.musica);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura do banco: " + this.alturaBanco);
    }

    @Override
    public void tocarAcorde(){
        System.out.println("O pianista " + this.nome + " tocou um acorde");
    }

    @Override
    public void errarPausa(){
        this.pontuacao -= 25;
        System.out.println("O pianista " + this.nome + " errou a pausa e vai recomeçar");
    }
}
