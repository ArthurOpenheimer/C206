package Estudo.AV2_SenhorDosAneis;

public class Mago extends Habitante implements Cura, Feitico{
    
    private String cor;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }

    public void atacar(){
        System.out.println();
        System.out.println("Mago atacando!");
        super.atacar();
    }

    @Override
    public void curar(){
        System.out.println();
        System.out.println("Mago curando!");
        float energia = this.getEnergia();
        energia += energia * 0.15;
        this.setEnergia(energia);
        System.out.println("Energia: "+this.getEnergia());
    }

    @Override
    public void lancaFeitico(){
        System.out.println();
        System.out.println("Mago fazendo feitiço!");
        float energia = this.getEnergia();
        energia -= energia * 0.10;
        this.setEnergia(energia);
        System.out.println("Energia: "+this.getEnergia());
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
