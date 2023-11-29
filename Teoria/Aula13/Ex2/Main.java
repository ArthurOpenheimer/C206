package Aula13.Ex2;

public class Main {

	public static void main(String[] args)  {

		Cliente c1 = new Cliente("Joao", 123456789);
		Cliente c2 = new Cliente("Maria", 987654321);
		
		Conta conta = new Conta(1500, 500);
		
		conta.addCliente(c1);
		conta.addCliente(c2);
		
		System.out.println("Mostra Info Clientes");
		System.out.println();
		conta.mostraInfo();
		System.out.println();

		System.out.println("Tenta Sacar 1000");
		try {
			conta.sacar(1000);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		conta.mostraInfo();
		System.out.println();
		
		System.out.println("Tenta Sacar 1000");
		try {
			conta.sacar(1000);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		conta.mostraInfo();
		System.out.println();
		
		System.out.println("Fim do programa");
	}
}