package Estudo.AV2_TLOU;

public class Cidade {
    
    private String nome;
    private Personagem personagens[] = new Personagem[10];

    public void adicionarPersonagem(Personagem p){
        for(int i = 0; i < personagens.length; i++){
            if(personagens[i] == null){
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens(){
        for(int i = 0; i < personagens.length; i++){
            if(personagens[i] != null){
                if(personagens[i] instanceof Humano){
                    Humano h = (Humano) personagens[i];
                    System.out.println("#####");
                    h.arma.mostrarInfos();
                    System.out.println();
                    h.modificarArma();
                    System.out.println();
                    h.atacar();
                    System.out.println();
                    h.defender();
                    System.out.println();
                    h.mostrarInfos();
                    System.out.println();
                    System.out.println("#####");
                }
                else if(personagens[i] instanceof Zumbi){
                    Zumbi z = (Zumbi) personagens[i];
                    System.out.println("#####");
                    z.transformacao();
                    System.out.println();
                    z.atacar();
                    System.out.println();
                    z.defender();
                    System.out.println();
                    z.mostrarInfos();
                    System.out.println();
                    System.out.println("#####");
                }
            }
        }
    }
}
