package Estudo.AV2_SenhorDosAneis;

public class Anao extends Habitante implements Mineracao {
    
    private float altura;
    private String reino;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);    
    }
    
    public void atacar(){
        System.out.println();
        System.out.println("Anão atacando!");
        super.atacar();
    }

    @Override
    public void minerar(){
        System.out.println();
        System.out.println("Anão minerando!");
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public String getReino(){
        return this.reino;
    }

    public void setReino(String reino){
        this.reino = reino;
    }
}
