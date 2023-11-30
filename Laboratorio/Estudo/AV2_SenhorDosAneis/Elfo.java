package Estudo.AV2_SenhorDosAneis;

public class Elfo extends Habitante implements Cura {
    
    private String tribo;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: "+this.tribo);
    }

    public void viajar(){
        System.out.println();
        System.out.println("Elfo viajando!");
    }

    public void atacar(){
        System.out.println();
        System.out.println("Elfo atacando!");
        super.atacar();
    }

    @Override
    public void curar(){
        System.out.println();
        System.out.println("Elfo curando!");
        float energia = this.getEnergia();
        energia += energia * 0.15;
        this.setEnergia(energia);
        System.out.println("Energia: "+this.getEnergia());
    }

    public void setTribo(String tribo){
        this.tribo = tribo;
    }
}
