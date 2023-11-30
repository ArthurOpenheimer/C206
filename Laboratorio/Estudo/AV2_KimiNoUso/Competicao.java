package Estudo.AV2_KimiNoUso;

public class Competicao {
    
    private Musico competidores[] = new Musico[10];

    public void addMusico(Musico competidor){
        for(int i = 0; i < this.competidores.length; i++){
            if(this.competidores[i] == null){
                this.competidores[i] = competidor;
                break;
            }
        }
    }

    public void listarCompetidores(){
        for(int i = 0; i < this.competidores.length; i++){
            if(this.competidores[i] instanceof Cellista){
                Cellista cellista = (Cellista) this.competidores[i];
                System.out.println();
                cellista.tocar();
                System.out.println();
                cellista.desafinar();
                System.out.println();
                cellista.mostraInfo();
            } 
            else if(this.competidores[i] instanceof Violinista){
                Violinista violinista = (Violinista) this.competidores[i];
                System.out.println();
                violinista.tocar();
                System.out.println();
                violinista.desafinar();
                System.out.println();
                violinista.mostraInfo();
            } 
            else if(this.competidores[i] instanceof Pianista){
                Pianista pianista = (Pianista) this.competidores[i];
                System.out.println();
                pianista.tocar();
                System.out.println();
                pianista.tocarAcorde();
                System.out.println();
                pianista.errarPausa();
                System.out.println();
                pianista.mostraInfo();
            }
        }
    }
}
