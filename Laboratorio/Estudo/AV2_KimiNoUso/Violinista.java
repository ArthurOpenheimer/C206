package Estudo.AV2_KimiNoUso;

public class Violinista extends Musico implements Som {
    
    private String marcaBreu;
    private boolean usaEspaleira;

    @Override
    public void tocar(){
        System.out.println("O violinista " + this.nome + " está tocando " + this.musica);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Marca do breu: " + this.marcaBreu);
        System.out.println("Usa espaleira: " + this.usaEspaleira);
    }

    @Override
    public void desafinar(){
        if(this.usaEspaleira == false){
            this.pontuacao -= this.pontuacao * 0.1;
            System.out.println("O violinista " + this.nome + " desafinou e perdeu 10% da pontuação");
        }
        else {
            this.pontuacao -= this.pontuacao * 0.05;
            System.out.println("O violinista " + this.nome + " desafinou e perdeu 5% da pontuação");
        }
    }
}
