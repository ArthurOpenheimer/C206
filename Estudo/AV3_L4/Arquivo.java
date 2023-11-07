package Estudo.AV3_L4;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    
    public void escrever(Veiculo veiculo){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Veiculos.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("####VEICULOS####" + "\n");
            bw.write(veiculo.getMarca() + "\n");
            bw.write(veiculo.getModelo() + "\n");
            bw.write(veiculo.getAno() + "\n");
            bw.write(veiculo.getKmRodados() + "\n");
            bw.write(veiculo.motor.getPotencia() + "\n");
            bw.write(veiculo.motor.getNumCilindros() + "\n");
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

    public ArrayList<Veiculo> ler(){
        ArrayList<Veiculo> veiculosNoArquivo = new ArrayList();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura;

        try{
            is = new FileInputStream("Veiculos.txt");
            isr = new InputStreamReader(is);
            br= new BufferedReader(isr);

            auxLeitura = br.readLine();

            while(auxLeitura!=null){
                if(auxLeitura.equalsIgnoreCase("####VEICULOS####")){
                    Veiculo auxVeiculo = new Veiculo();
                    auxVeiculo.setMarca(br.readLine());
                    auxVeiculo.setModelo(br.readLine());
                    auxVeiculo.setAno(Integer.parseInt(br.readLine()));
                    auxVeiculo.setKmRodados(Double.parseDouble(br.readLine()));
                    auxVeiculo.motor.setPotencia(Double.parseDouble(br.readLine()));
                    auxVeiculo.motor.setNumCilindros(Integer.parseInt(br.readLine()));

                    veiculosNoArquivo.add(auxVeiculo);
                }
                auxLeitura=br.readLine(); 
            }
        }catch (Exception e){

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return veiculosNoArquivo;
    }
}
