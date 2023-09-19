package Aula9.Brownies;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionando café ao brownie");
    }

    @Override
	public void addCarrinhoDeCompras(){
		System.out.println("Brownie de café sendo adicionado");
	}
    
}
