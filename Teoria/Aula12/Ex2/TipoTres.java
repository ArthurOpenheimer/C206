package Aula12.Ex2;

public class TipoTres extends Tipo {
    
    public TipoTres(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void doSomething() {
        System.out.println("TipoTres " + this.valor);
    }
}
