package Estudo.AV2_KimiNoUso;

public class Main {
    
    public static void main(String[] args) {
        
        Competicao competicao = new Competicao();

        //criando instrumentos
        Instrumento violino = new Instrumento();
        violino.setModelo("Stradivarius");
        violino.setCor("Marrom");
        violino.setAno(1721);

        Instrumento piano = new Instrumento();
        piano.setModelo("Steinway");
        piano.setCor("Preto");
        piano.setAno(2018);

        Instrumento violoncelo = new Instrumento();
        violoncelo.setModelo("Stradivarius");
        violoncelo.setCor("Marrom");
        violoncelo.setAno(1712);

        //criando musicos
        Violinista violinista = new Violinista();
        violinista.setNome("Kaori Miyazono");
        violinista.setMusica("Liebesleid");
        violinista.setIdade(14);
        violinista.setPontuacao(100);
        violinista.instrumento = violino;
        
        Pianista pianista = new Pianista();
        pianista.setNome("Kousei Arima");
        pianista.setMusica("Ballade No. 1 in G Minor");
        pianista.setIdade(14);
        pianista.setPontuacao(100);
        pianista.instrumento = piano;

        Cellista cellista = new Cellista();
        cellista.setNome("Sawabe Tsubaki");
        cellista.setMusica("Liebesfreud");
        cellista.setIdade(14);
        cellista.setPontuacao(100);
        cellista.instrumento = violoncelo;

        //adicionando musicos na competicao
        competicao.addMusico(violinista);
        competicao.addMusico(pianista);
        competicao.addMusico(cellista);

        //listando competidores
        competicao.listarCompetidores();
    }
}
