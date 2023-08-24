package Aula4.Ex5;

public class Arma {
    String nome, descricao;
    int poder, resistencia;

    void mostraInfoArma(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Poder: " + this.poder);
        System.out.println("Resistência: " + this.resistencia);
    }
}
