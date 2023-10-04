package AV2_Arthur_Openheimer_225;

public class Main {
    
    public static void main(String[] args) {
        
        //criando aldeia
        Aldeia aldeia = new Aldeia();
        aldeia.setNome("Konoha");
        aldeia.setPaisLocalizado("Pais do Fogo");
        aldeia.setLider("Hokage");

        //criando lista de ninjas da aldeia por agregação
        Ninja[] listaNinjas = new Ninja[3];
        aldeia.setNinjas(listaNinjas);

        //criando jutsus
        Jutsu sharingan = new Jutsu();
        sharingan.setTipo("Kekkei-Genkai");
        sharingan.setRankJutsu('S');

        Jutsu chidori = new Jutsu();
        chidori.setTipo("Taijutsu");
        chidori.setRankJutsu('A');

        //criando ninjas
        Gennin sasuke = new Gennin();
        sasuke.setNome("Sasuke");
        sasuke.setIdade(16);
        sasuke.setPoder(10);
        sasuke.setChakra(100);
        sasuke.setNumMissoesCompletas(2);
        sasuke.setNomeSensei("Kakashi");
        sasuke.setJutsu(chidori);

        Jonnin shisui = new Jonnin();
        shisui.setNome("Shisui");
        shisui.setIdade(20);
        shisui.setPoder(20);
        shisui.setChakra(200);
        shisui.setNumMissoesCompletas(50);
        shisui.setHabilidadeEspecial("Teletransporte");
        shisui.setJutsu(sharingan);

        //adicionando ninjas na aldeia
        aldeia.registrarNinja(sasuke);
        aldeia.registrarNinja(shisui);

        //listando ninjas da aldeia
        aldeia.listarNinjas();

        //quantidade de ninjas na aldeia
        System.out.println("Quantidade de ninjas na aldeia: " + Ninja.getNumTotalNinjas());
    }
}
