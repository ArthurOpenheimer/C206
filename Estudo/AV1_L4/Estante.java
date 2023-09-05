package Estudo.AV1_L4;

public class Estante {

    int idEstante;
    char letra;
    Livro livros[] = new Livro[120];

    void addLivros(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }

    void porcentagemGen(){
        
        int drama = 0;
        int suspense = 0;
        int outros = 0;
        int notNull = 0;
        
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                notNull++;
                if (livros[i].genLiterario.equalsIgnoreCase("Drama")) {
                    drama++;
                } else if (livros[i].genLiterario.equalsIgnoreCase("Suspense")) {
                    suspense++;
                } else {
                    outros++;
                }
            }
        }

        System.out.println("Porcentagem de livros de Drama: " + (drama*100)/notNull + "%");
        System.out.println("Porcentagem de livros de Suspense: " + (suspense*100)/notNull + "%");
        System.out.println("Porcentagem de livros de Outros: " + (outros*100)/notNull + "%");
    }

    void livroMaisEMenosPag(){
        
        Livro maisPag = null;
        Livro menosPag = null;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (maisPag == null) {
                    maisPag = livros[i];
                } else if (livros[i].qtdFolhas > maisPag.qtdFolhas) {
                    maisPag = livros[i];
                }

                if (menosPag == null) {
                    menosPag = livros[i];
                } else if (livros[i].qtdFolhas < menosPag.qtdFolhas) {
                    menosPag = livros[i];
                }
            }
        }

        System.out.println("Informações do livro com mais páginas:");
        maisPag.mostrarInfos();
        System.out.println("Informações do autor:");
        maisPag.autor.mostrarInfos();

        System.out.println();
        System.out.println("Informações do livro com menos páginas:");
        menosPag.mostrarInfos();
        System.out.println("Informações do autor:");
        menosPag.autor.mostrarInfos();
    }

    void mostrarInfos(){
        System.out.println("ID da Estante: " + idEstante);
        System.out.println("Letra da Estante: " + letra);
        System.out.println();
        System.out.println("Livros:");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println("Livro " + (i+1) + ": " + livros[i].titulo);
                System.out.println("Genero Literario: " + livros[i].genLiterario);
                System.out.println("Quantidade de Folhas: " + livros[i].qtdFolhas);
                System.out.println("Editora: " + livros[i].editora);
                System.out.println("Autor: " + livros[i].autor.nome);
                System.out.println();
            }
        }
    }
}
