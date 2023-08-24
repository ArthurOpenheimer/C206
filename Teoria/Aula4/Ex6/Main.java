package Aula4.Ex6;

public class Main {
    
    public static void main(String[] args) {
        
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //atribuindo valores de piloto
        piloto1.nome = "Mario";
        piloto2.nome = "Wario";

        piloto1.vilao = false;
        piloto2.vilao = true;
        ////

        //atribuindo valores de kart
        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.motor.cilindradas = "50";
        kart2.motor.cilindradas = "150";

        kart1.motor.velocidadeMaxima = 100;
        kart2.motor.velocidadeMaxima = 150;
        //

        //chamando os métodos
        kart1.pular();
        kart2.pular();

        kart1.soltarTurbo();
        kart2.soltarTurbo();

        kart1.fazerDrift();
        kart2.fazerDrift();

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();

        kart1.piloto.soltaSuperPoder();
        kart2.piloto.soltaSuperPoder();
        ////
    }
}
