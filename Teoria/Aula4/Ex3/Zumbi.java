package Aula4.Ex3;

public class Zumbi {
    double vida;
    String nome;

    double mostrarVida() {
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
