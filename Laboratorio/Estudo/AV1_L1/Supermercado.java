package Estudo.AV1_L1;

public class Supermercado {
    
    String nome;
    String cnpj;
    String endereco;
    String numTelefone;
    Produto[] produtos = new Produto[30];

    void addProduto(Produto p){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = p;
                break;
            }
        }
    }

    void mostrarMaisCaroBarato(){
        Produto maisCaro = null;
        Produto maisBarato = null;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                break;
            }
            if(i == 0){
                maisCaro = produtos[i];
                maisBarato = produtos[i];
            }
            if(produtos[i].valor > maisCaro.valor){
                maisCaro = produtos[i];
            }
            if(produtos[i].valor < maisBarato.valor){
                maisBarato = produtos[i];
            }
        }

        System.out.println("Mais caro: ");
        maisCaro.mostrarInfos();
        System.out.println("Mais barato: ");
        maisBarato.mostrarInfos();
    }

    void contarCategorias(){
        int higiene = 0;
        int utensilios = 0;
        int alimenticios = 0;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                break;
            }
            if(produtos[i].categoria.equals("Higiene")){
                higiene += produtos[i].quantidade; 
            }
            if(produtos[i].categoria.equals("Utensilios")){
                utensilios += produtos[i].quantidade; 
            }
            if(produtos[i].categoria.equals("Alimenticios")){
                alimenticios += produtos[i].quantidade; 
            }
        }

        System.out.println("Higiene: " + higiene);
        System.out.println("Utensílios: " + utensilios);
        System.out.println("Alimentícios: " + alimenticios);
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + numTelefone);
    }
}
