package Aula8;

import Aula8.Inimigo.Asteroide;
import Aula8.Jogador.Nave;

public class MainNave{
    public static void main(String args[]){
        Nave nave1 = new Nave("Nave1", 100, "Explosivo");
        Nave nave2 = new Nave("Nave2", 90, "Normal");

        Asteroide ast1 = new Asteroide("Asteroide1", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide2", "Pequeno");
        
        nave1.atirar(ast1);
        nave1.atirar(ast2);
        
        nave2.atirar(ast1);
        nave2.atirar(ast2);

    }

}