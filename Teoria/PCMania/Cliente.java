package PCMania;

public class Cliente {
    String nome;
    long cpf;
    Computador [] carrinho;

    float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < carrinho.length; i++){
            if(carrinho[i] != null){
                total += carrinho[i].preco;
            }
        }
        return total;
    }
}
