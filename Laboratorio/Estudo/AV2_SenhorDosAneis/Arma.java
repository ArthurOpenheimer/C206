package Estudo.AV2_SenhorDosAneis;

public class Arma {
    
    private String nomeArma;
    private boolean magica;

    public String getNome(){
        return this.nomeArma;
    }

    public void setNome(String nome){
        this.nomeArma = nome;
    }

    public boolean getMagica(){
        return this.magica;
    }

    public void setMagica(boolean magica){
        this.magica = magica;
    }
}
