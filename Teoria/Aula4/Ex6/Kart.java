package Aula4.Ex6;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        this.motor = new Motor();   
    }

    void pular(){
        System.out.println("Pulando!!!");
    }

    void soltarTurbo(){
        System.out.println("Turbo solto!!!");
    }

    void fazerDrift(){
        System.out.println("DORIFTOOO!!!");
    }
}
