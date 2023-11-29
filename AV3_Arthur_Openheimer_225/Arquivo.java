package AV3_Arthur_Openheimer_225;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Livro livro){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("Livros.txt",true); // Arquivo
            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);
            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Escrevendo os dados no arquivo
            bw.write("####LIVROS####" + "\n");
            bw.write(livro.getTitulo() + "\n");
            bw.write(livro.getPreco() + "\n");
            bw.write(livro.getGenLiterario() + "\n");
            bw.write(livro.getQtdFolhas() + "\n");
            bw.write(livro.getEditora() + "\n");
            bw.write(livro.getAnoLancamento() + "\n");

        } catch (IOException e) {
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public ArrayList<Livro> ler(){
        // Criando array list que armazena os livros encontrados no arquivo
        ArrayList<Livro> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try{
            is = new FileInputStream("Livros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se encontramos a flag que indica o início de um livro
                if(linhaLer.contains("####LIVROS####")){
                    // Criando um livro auxiliar
                    Livro auxLivro = new Livro();

                    // Lendo as informações do livro
                    auxLivro.setTitulo(br.readLine());
                    auxLivro.setPreco(Double.parseDouble(br.readLine()));
                    auxLivro.setGenLiterario(br.readLine());
                    auxLivro.setQtdFolhas(Integer.parseInt(br.readLine()));
                    auxLivro.setEditora(br.readLine());
                    auxLivro.setAnoLancamento(Integer.parseInt(br.readLine()));

                    // Adicionando o livro na lista de livros encontrados
                    encontreiNoArquivo.add(auxLivro);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return encontreiNoArquivo;
    }
}