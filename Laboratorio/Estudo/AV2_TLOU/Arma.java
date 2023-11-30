package Estudo.AV2_TLOU;

public class Arma {

    private int forca;
    private String tipoArma;

    public void mostrarInfos(){
        System.out.println("Força: " + this.forca);
        System.out.println("Tipo de arma: " + this.tipoArma);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
