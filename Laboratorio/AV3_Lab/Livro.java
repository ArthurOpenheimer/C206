package AV3_Lab;

public class Livro implements Comparable<Livro>{
    
    private String titulo;
    private double preco;
    private String genLiterario;
    private int qtdFolhas;
    private String editora;
    private int anoLancamento;

    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Preço: " + this.preco);
        System.out.println("Gênero Literário: " + this.genLiterario);
        System.out.println("Quantidade de Folhas: " + this.qtdFolhas);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de Lançamento: " + this.anoLancamento + "\n");
    }

    @Override //sobrescreve o método compareTo para que possamos ordenar os livros por preço
    public int compareTo(Livro livro) {
        return Double.compare(this.preco, livro.getPreco());
    }
    
    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setGenLiterario(String genLiterario){
        this.genLiterario = genLiterario;
    }

    public void setQtdFolhas(int qtdFolhas){
        this.qtdFolhas = qtdFolhas;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    //getters
    public double getPreco(){
        return this.preco;
    }

    public String getEditora(){
        return this.editora;
    }

    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getGenLiterario(){
        return this.genLiterario;
    }

    public int getQtdFolhas(){
        return this.qtdFolhas;
    }
}
