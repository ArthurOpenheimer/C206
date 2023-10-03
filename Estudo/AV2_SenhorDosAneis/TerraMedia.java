package Estudo.AV2_SenhorDosAneis;

public class TerraMedia {
    
    private Habitante herois[] = new Habitante[10];


    public void addHabitante(Habitante habitante){
        for (int i = 0; i < this.herois.length; i++){
            if (this.herois[i] == null){
                this.herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        for (int i = 0; i < this.herois.length; i++){
            if (this.herois[i] != null){
                //Execute todos os métodos de cada habitante da lista
                if(this.herois[i] instanceof Anao){
                    Anao anao = (Anao) this.herois[i];
                    anao.mostraInfo();
                    anao.atacar();
                    anao.minerar();
                }
                else if(this.herois[i] instanceof Elfo){
                    Elfo elfo = (Elfo) this.herois[i];
                    elfo.mostraInfo();
                    elfo.atacar();
                    elfo.viajar();
                    elfo.curar();
                }
                else if(this.herois[i] instanceof Mago){
                    Mago mago = (Mago) this.herois[i];
                    mago.mostraInfo();
                    mago.atacar();
                    mago.curar();
                    mago.lancaFeitico();
                }
        
                //herois[i].mostraInfo();
            }
        }
    }
}
