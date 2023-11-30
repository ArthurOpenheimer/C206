package Estudo.AV3_L4;

public class Motor {
    private double potencia;
    private int numCilindros;

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public void setNumCilindros(int numCilindros){
        this.numCilindros = numCilindros;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public int getNumCilindros(){
        return this.numCilindros;
    }
}
