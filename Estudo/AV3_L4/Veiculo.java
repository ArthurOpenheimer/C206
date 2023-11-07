package Estudo.AV3_L4;

public class Veiculo implements Comparable<Veiculo> {
    private String marca;
    private String modelo;
    private int ano;
    private double kmRodados;
    Motor motor;

    public Veiculo(){
        this.motor = new Motor();
    }
    
    @Override
    public int compareTo(Veiculo v) { //compare ano
        if(this.ano > v.getAno()){
            return 1;
        } else if(this.ano < v.getAno()){
            return -1;
        } else {
            return 0;
        }

    }

    public void mostrarInfos(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Km rodados: " + this.kmRodados);
        System.out.println("Potência do motor: " + this.motor.getPotencia());
        System.out.println("Número de cilindros: " + this.motor.getNumCilindros());
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setKmRodados(double kmRodados){
        this.kmRodados = kmRodados;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public double getKmRodados(){
        return this.kmRodados;
    }
}
