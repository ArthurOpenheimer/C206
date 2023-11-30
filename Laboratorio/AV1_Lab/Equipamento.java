package AV1_Lab;

public class Equipamento {
    
    int numSerie;
    String nome;
    String marca;
    double valorAquisicao;
    String status; //Funcionamento ou Manutencao

    void mostrarInfos(){
        System.out.println("Numero de Serie: " + numSerie);
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Valor de Aquisicao: " + valorAquisicao);
        System.out.println("Status: " + status);
    }
}
