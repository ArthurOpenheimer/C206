package Aula4.Ex5;

public class Main {
    
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        //criando personagens
        p1.nome = "Kayn";
        p2.nome = "Valmar";

        p1.pontos = 75;
        p2.pontos = 50;

        Arma a1 = new Arma();
        Arma a2 = new Arma();

        a1.nome = "Rhaast";
        a2.nome = "Varus";

        a1.descricao = "Uma foice darkin";
        a2.descricao = "Um arco darkin";

        a1.poder = 10;
        a2.poder = 5;

        a1.resistencia = 10;
        a2.resistencia = 10;

        p1.arma = a1;
        p2.arma = a2;
        ////

        //vida durante a batalha
        System.out.println("vidas antes da batalha:");
        System.out.println(p1.nome + ": " + p1.pontos);
        System.out.println(p2.nome + ": " + p2.pontos);

        p1.tomarDano();
        p2.tomarDano();

        System.out.println("vidas depois da batalha:");
        System.out.println(p1.nome + ": " + p1.pontos);
        System.out.println(p2.nome + ": " + p2.pontos);
        ////

        //armas durante a batalha
        System.out.println("Arma do " + p1.nome + ":");
        p1.arma.mostraInfoArma();

        System.out.println("Arma do " + p2.nome + ":");
        p2.arma.mostraInfoArma();

        System.out.println("Usando arma do " + p1.nome + ":");
        p1.usarArma();

        System.out.println("Usando arma do " + p2.nome + ":");
        p2.usarArma();

        System.out.println("Arma do " + p1.nome + " depois de usar:");
        p1.arma.mostraInfoArma();

        System.out.println("Arma do " + p2.nome + " depois de usar:");
        p2.arma.mostraInfoArma();
        ////
    }
}
