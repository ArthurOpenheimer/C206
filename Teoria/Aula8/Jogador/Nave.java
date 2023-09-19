package Aula8.Jogador;

import Aula8.Inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(tipoTiro == "Explosivo"){
            ast.destruir();
        }else{
            if(ast.getTipoAsteroide() == "Grande"){
                System.out.println("Tiro normal não destrói asteroide grande!");
            }else{
                ast.destruir();
            }
        }
    }    
}