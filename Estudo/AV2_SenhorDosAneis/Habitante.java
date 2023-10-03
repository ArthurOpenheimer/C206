package Estudo.AV2_SenhorDosAneis;

public abstract class Habitante {
    
    public static int contador = 0;
    private int id;
    private String nome;
    private int idade;
    private float energia;

    Arma arma;

    Habitante(){
        contador++;
        this.id = contador;
    }

    public void atacar(){
        if (this.arma == null){
            System.out.println("Não é possível atacar sem arma!");
        } else {
            if (this.arma.getMagica() == true){
                this.energia -= 20;
                System.out.println("Atacando com a arma mágica " + this.arma.getNome() + "!");
                System.out.println("Energia: " + this.energia);
            } else {
                this.energia -= 10;
                System.out.println("Atacando com a arma não mágica " + this.arma.getNome() + "!");
                System.out.println("Energia: " + this.energia);
            }
        }
    }

    public void mostraInfo(){
        System.out.println();
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getEnergia(){
        return this.energia;
    }

    public void setEnergia(float energia){
        this.energia = energia;
    }
}
