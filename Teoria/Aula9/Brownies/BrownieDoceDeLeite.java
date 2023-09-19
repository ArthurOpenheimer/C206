package Aula9.Brownies;

public class BrownieDoceDeLeite extends Brownie {
    
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando doce de leite ao brownie");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de doce de leite sendo adicionado");
    }
}
