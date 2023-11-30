package Estudo.AV2_SenhorDosAneis;

public class Main {
    
    public static void main(String[] args){

        TerraMedia tm = new TerraMedia();

        //criando armas
        Arma martelo = new Arma();
        martelo.setNome("Martelo");
        martelo.setMagica(false);

        Arma arco = new Arma();
        arco.setNome("Arco");
        arco.setMagica(true);

        Arma cajado = new Arma();
        cajado.setNome("Cajado");
        cajado.setMagica(true);

        //criando habitantes
        Anao anao = new Anao();
        anao.setNome("Gimli");
        anao.setEnergia(100);
        anao.setAltura(1.15f);
        anao.setIdade(500);
        anao.setReino("Erebor");
        anao.arma = martelo;

        Elfo elfo = new Elfo();
        elfo.setNome("Legolas");
        elfo.setEnergia(150);
        elfo.setIdade(300);
        elfo.setTribo("Lothorien");
        elfo.arma = arco;

        Mago mago = new Mago();
        mago.setNome("Gandalf");
        mago.setEnergia(200);
        mago.setIdade(1000);
        mago.setCor("Cinza");
        mago.arma = cajado;

        //adicionando habitantes
        tm.addHabitante(anao);
        tm.addHabitante(elfo);
        tm.addHabitante(mago);

        //listando habitantes
        tm.listarHabitantes();
    }   
}
