package Estudo.AV1_L4;

public class Livro {
    
    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;
    Autor autor;

    public Livro(){
        this.autor = new Autor();
    }

    void mostrarInfos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero Literario: " + genLiterario);
        System.out.println("Quantidade de Folhas: " + qtdFolhas);
        System.out.println("Editora: " + editora);
        System.out.println("Autor: " + autor.nome);
    }
}
