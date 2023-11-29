package Aula13.Ex1;

public class Main {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Joao", 123456789);
        Cliente c2 = new Cliente("Maria", 987654321);
        Cliente c3 = null;

        Conta conta = new Conta(1000, 500);

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostraInfo();

        System.out.println("Fim do programa");
    }
}
