package Estudo.AV2_KimiNoUso;

public abstract class Musico {
    
    protected static int contador = 0;
    protected int codigo;
    protected String nome;
    protected int idade;
    protected String musica;
    protected int pontuacao;

    Instrumento instrumento;

    Musico(){
        contador++;
        this.codigo = contador;
    }

    public abstract void tocar();

    public void mostraInfo(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Musica: " + this.musica);
        System.out.println("Pontuacao: " + this.pontuacao);
        System.out.println("Instrumento:");
        System.out.println("Modelo: " + this.instrumento.getModelo());
        System.out.println("Cor: " + this.instrumento.getCor());
        System.out.println("Ano: " + this.instrumento.getAno());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setMusica(String musica){
        this.musica = musica;
    }

    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }
}
