package Aula12.Ex2;

public class TipoUm extends Tipo {
    
    public TipoUm(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void doSomething() {
        System.out.println("TipoUm " + this.valor);
    }
}
