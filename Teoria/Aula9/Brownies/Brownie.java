package Aula9.Brownies;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando " + this.nome + " ao carrinho");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando valor total da compra de " + this.nome + " que custa " + this.preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }

    public String getNome(){
        return this.nome;
    }
}
