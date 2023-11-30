package Estudo.AV2_TLOU;

public class Main {
    
    public static void main(String[] args) {
        
        Cidade Seattle = new Cidade();

        //criando armas
        Arma faca = new Arma();
        faca.setForca(10);
        faca.setTipoArma("Faca");

        Arma pistola = new Arma();
        pistola.setForca(20);
        pistola.setTipoArma("Pistola");

        //criando humanos
        Humano Ellie = new Humano();
        Ellie.setNome("Ellie");	
        Ellie.setVida(100);
        Ellie.setIdade(14);
        Ellie.setVagalume(true);
        Ellie.addArma(faca);
        Ellie.setEnergia(100);
        Ellie.setDistanciaEscuta(100);

        Humano Joel = new Humano();
        Joel.setNome("Joel");
        Joel.setVida(100);
        Joel.setIdade(40);
        Joel.setVagalume(false);
        Joel.addArma(pistola);
        Joel.setEnergia(80);
        Joel.setDistanciaEscuta(50);

        //criando infectados
        Zumbi zumbi1 = new Zumbi();
        zumbi1.setVida(100);
        zumbi1.setDiasInfeccao(10);
        zumbi1.transformacao();
        
        Zumbi zumbi2 = new Zumbi();
        zumbi2.setVida(150);
        zumbi2.setDiasInfeccao(100);
        zumbi2.transformacao();
        
        Zumbi zumbi3 = new Zumbi();
        zumbi3.setVida(200);
        zumbi3.setDiasInfeccao(400);
        zumbi3.transformacao();

        //adicionando personagens na cidade
        Seattle.adicionarPersonagem(Ellie);
        Seattle.adicionarPersonagem(Joel);
        Seattle.adicionarPersonagem(zumbi1);
        Seattle.adicionarPersonagem(zumbi2);
        Seattle.adicionarPersonagem(zumbi3);

        //listando personagens
        System.out.println();
        System.out.println("######################");
        System.out.println("Personagens da cidade:");
        System.out.println("######################");
        System.out.println();
        Seattle.listarPersonagens();

        //modificando habilidade
        System.out.println();
        System.out.println("###############################");
        System.out.println("Modificando armas e habilidades");
        System.out.println("###############################");
        System.out.println();

        Ellie.modificarArma();
        Joel.modificarArma();

        Ellie.modificarHabilidade(10, "Energia");
        Ellie.modificarHabilidade(10, "Distancia de escuta");

        Joel.modificarHabilidade(15, "Energia");
        Joel.modificarHabilidade(15, "Distancia de escuta");

        //listando personagens após modificação
        System.out.println();
        System.out.println("##############################");
        System.out.println("Personagens após modificações:");
        System.out.println("##############################");
        System.out.println();

        //chamar mostrainfo de cada personagem
        Ellie.mostrarInfos();
        System.out.println();
        Joel.mostrarInfos();


        System.out.println();
        System.out.println("##########################");
        System.out.println("Quantidade de personagens:");
        System.out.println("##########################");
        System.out.println();

        System.out.println("Quantidade de personagens: " + Personagem.getNumPersonagem());
    }
}
