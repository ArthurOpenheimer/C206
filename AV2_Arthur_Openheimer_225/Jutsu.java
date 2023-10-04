package AV2_Arthur_Openheimer_225;

public class Jutsu {
    
    private String tipo;
    private char rankJutsu;

    public void mostrarInfos(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Rank: " + this.rankJutsu);
    }

    //Getters

    public String getTipo(){
        return this.tipo;
    }

    //Setters

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setRankJutsu(char rankJutsu){
        this.rankJutsu = rankJutsu;
    }


}
