package Estudo.AV3_L1;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Filme f){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Filmes.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("####FILMES####" + "\n");
            bw.write(f.getNomeFilme() + "\n");
            bw.write(f.getGeneroFilme() + "\n");
            bw.write(f.getDuracaoMin() + "\n");
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Filme> ler(){
        ArrayList<Filme> filmesNoArquivo = new ArrayList();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura;

        try{
            is = new FileInputStream("Filmes.txt");
            isr = new InputStreamReader(is);
            br= new BufferedReader(isr);

            auxLeitura = br.readLine();

            while(auxLeitura!=null){
                if(auxLeitura.equalsIgnoreCase("####FILMES####")){
                    Filme auxFilme = new Filme();
                    auxFilme.setNomeFilme(br.readLine());
                    auxFilme.setGeneroFilme(br.readLine());
                    auxFilme.setDuracaoMin(Integer.parseInt(br.readLine()));

                    filmesNoArquivo.add(auxFilme);
                }
                auxLeitura =br.readLine(); 
            }
        }catch (Exception e){

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return filmesNoArquivo;
    }
}

