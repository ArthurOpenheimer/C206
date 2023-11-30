package Estudo.AV2_TLOU;

public class Zumbi extends Personagem implements Lutar, Infectar{
    
    private int diasInfeccao;
    private boolean cego;

    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Dias Infectado: " + this.diasInfeccao);
        System.out.println("Cego: " + this.cego);
        
        if(this.diasInfeccao >= 2 && this.diasInfeccao <= 14){ //corredor
            System.out.println("Esse zumbi é um corredor");
        }
        else if(this.diasInfeccao > 14 && this.diasInfeccao <= 365){ //perseguidor
            System.out.println("Esse zumbi é um perseguidor");
        }
        else if(this.diasInfeccao > 365){ //estalador
            System.out.println("Esse zumbi é um estalador");
        }
    }

    public void transformacao(){
        if(this.diasInfeccao >= 2 && this.diasInfeccao <= 14){ //corredor
            this.cego = false;
        }
        else if(this.diasInfeccao > 14 && this.diasInfeccao <= 365){ //perseguidor
            this.cego = false;
        }
        else if(this.diasInfeccao > 365){ //estalador
            this.cego = true;
        }
    }

    @Override
    public void atacar() {
        System.out.println("Infectado atacou!");
    }

    @Override
    public void defender() {
        System.out.println("Infectado defendeu!");
    }

    @Override
    public void infectou() {
        System.out.println("O zumbi mordeu e infectou um Humano.");
    }

    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }
}
