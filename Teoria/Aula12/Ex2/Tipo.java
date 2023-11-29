package Aula12.Ex2;

public abstract class Tipo implements Comparable<Tipo>{
    protected String nome;
    protected int valor;

    public Tipo(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public abstract void doSomething();

    @Override
    public int compareTo(Tipo o) {
        return Integer.compare(o.valor, this.valor);
    }

}
