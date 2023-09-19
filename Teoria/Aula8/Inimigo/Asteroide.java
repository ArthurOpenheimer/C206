package Aula8.Inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide " + tipoAsteroide + " Destruido!");
    }

    public String getTipoAsteroide(){
        return this.tipoAsteroide;
    }
}