package Aula9;

import Aula9.Brownies.BrownieCafe;
import Aula9.Brownies.BrownieDoceDeLeite;
import Aula9.Brownies.BrownieNutella;
import Aula9.Comprador.Comprador;

public class Main {

	public static void main(String[] args) {
		BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
		BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
		BrownieDoceDeLeite bwDoceLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");

		Comprador comprador = new Comprador("Comprador", 1000.95);

		comprador.efetuarCompra(bwCafe);
		comprador.efetuarCompra(bwNutella);
		comprador.efetuarCompra(bwDoceLeite);
	}
}
