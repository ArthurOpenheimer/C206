package Aula7;

public class Main {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        conta.setClientes(new Cliente[3]);
        conta.getClientes()[0] = new Cliente();
        conta.getClientes()[0].setNome("Arthur");
        conta.getClientes()[0].setCpf(123456789);

        conta.getClientes()[1] = new Cliente();
        conta.getClientes()[1].setNome("João");
        conta.getClientes()[1].setCpf(987654321);

        conta.getClientes()[2] = new Cliente();
        conta.getClientes()[2].setNome("Maria");
        conta.getClientes()[2].setCpf(123123123);

        conta.setNumero(123);
        conta.setLimite(1000);
        conta.deposita(1000);
        conta.sacar(500);
        conta.sacar(1000);

        
    }
}
