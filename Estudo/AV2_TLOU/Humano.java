package Estudo.AV2_TLOU;

public class Humano extends Personagem implements Aprimorar, Lutar{

    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    Arma arma;

    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vagalume: " + this.vagalume);
        System.out.println("Energia: " + this.energia);
        System.out.println("Distancia de escuta: " + this.distanciaEscuta);
        System.out.println("Arma: ");
        this.arma.mostrarInfos();
    }
    
    public void addArma(Arma arma){
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou com a arma:");
        this.arma.mostrarInfos();
    }

    @Override
    public void defender() {
        System.out.println(this.nome + " defendeu com a arma:");
        this.arma.mostrarInfos();
    }

    @Override
    public void modificarArma() {
        this.arma.setForca(this.arma.getForca() + 5);
        System.out.println("Arma aprimorada!");
        this.arma.mostrarInfos();
    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if(qtdPilulas <= 0){
            System.out.println("Quantidade de pílulas inválidas, favor informar um valor maior que 0");
        }
        else{
            if(tipoHabilidade.equals("Energia")){
                if(qtdPilulas <= 10){
                    this.energia += this.energia * 0.02;
                }
                else if(qtdPilulas <= 15){
                    this.energia += this.energia * 0.04;
                }
            }
            else if(tipoHabilidade.equals("Distancia de escuta")){
                if(qtdPilulas <= 10){
                    this.distanciaEscuta += 0.2;
                }
                else if(qtdPilulas <= 15){
                    this.distanciaEscuta += 0.5;
                }
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }
}
