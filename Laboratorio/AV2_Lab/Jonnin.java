package AV2_Lab;

public class Jonnin extends Ninja implements Batalhar, Lideranca {
    
    private String habilidadeEspecial;

    @Override
    public void treinarJutsu(){ 
        if(this.getJutsu().getTipo() == "Kekkei-Genkai") {
            this.setPoder(this.getPoder() + 100);
        }
        else if(this.getJutsu().getTipo() == "Taijutsu") {
            this.setPoder(this.getPoder() + 40);
        }
        
        System.out.println(this.getNome() + " realizou um treinamento do seu jutsu e agora seu poder é " + this.getPoder());
    }

    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Habilidade Especial: " + this.habilidadeEspecial);
    }

    @Override
    public void lutar(){
        System.out.println("Está acontecendo uma luta");
        this.mostrarInfos();
    }

    @Override
    public void atacar(){ 
        if(this.habilidadeEspecial == "Clones") {
            this.setChakra(this.getChakra() - (this.getChakra() * 0.05));
        }
        else if(this.habilidadeEspecial == "Teletransporte") {
            this.setChakra(this.getChakra() - (this.getChakra() * 0.07));
        }
        System.out.println("Nome: " + this.getNome());
        System.out.println("Chakra após ataque: " + this.getChakra());
    }

    @Override
    public void liderarTime(){
        System.out.println(this.getNome() + " está liderando um time");
    }

    //Setters

    public void setHabilidadeEspecial(String habilidadeEspecial){
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
