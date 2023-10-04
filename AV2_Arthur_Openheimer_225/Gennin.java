package AV2_Arthur_Openheimer_225;

public class Gennin extends Ninja implements Treinamento, Batalhar {
    
    private String nomeSensei;

    public void realizarMissao(){
        System.out.println(this.getNome() + " está realizando uma missão");
    }

    @Override
    public void treinarJutsu(){
        if (this.getJutsu().getTipo() == "Kekkei-Genkai") {
            this.setPoder(this.getPoder() + 15);
        }
        else if (this.getJutsu().getTipo() == "Taijutsu") {
            this.setPoder(this.getPoder() + 5);
        }
        
        System.out.println(this.getNome() + " realizou um treinamento do seu jutsu e agora seu poder é " + this.getPoder());
    }

    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Nome do Sensei: " + this.nomeSensei);
    }

    @Override
    public void treinarParaExame(){
        if (this.nomeSensei == "Kakashi") {
            this.setPoder(this.getPoder() + 10);
            System.out.println(this.getNome() + " é treinado pelo Kakashi, logo vai ter mais poder");
        }
        else {
            System.out.println(this.getNome() + " está em treinamento");
        }
    }

    @Override
    public void lutar(){
        System.out.println("Está acontecendo uma luta");
        this.mostrarInfos();
    }

    @Override
    public void atacar(){
        System.out.println("Ataque fraco, sem chakra utilizado");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Chakra após ataque: " + this.getChakra());
    }

    //Setters

    public void setNomeSensei(String nomeSensei){
        this.nomeSensei = nomeSensei;
    }
}
