package Aula12.Ex2;

public class TipoDois extends Tipo {
    
    public TipoDois(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void doSomething() {
        System.out.println("TipoDois " + this.valor);
    }
}
