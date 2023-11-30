package AV2_Lab;

public class Aldeia {
    
    private String nome;
    private String paisLocalizado;
    private String lider;

    private Ninja[] ninjas;

    public void registrarNinja(Ninja ninja) { // Método para registrar ninjas
        for(int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] == null) {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void listarNinjas() { // Método para listar ninjas de acordo com o tipo de ninja
        if (ninjas.length >= 2) {    
            for (int i = 0; i < ninjas.length; i++) {
                if (ninjas[i] != null) {
                    if(ninjas[i] instanceof Gennin){ //chamando todos os métodos da classe Gennin
                        Gennin gennin = (Gennin) ninjas[i]; // Casting
                        gennin.classificar();
                        System.out.println();
                        gennin.realizarMissao();
                        System.out.println();
                        gennin.treinarJutsu();
                        System.out.println();
                        gennin.treinarParaExame();
                        System.out.println();
                        gennin.lutar();
                        System.out.println();
                        System.out.println("Atacando...");
                        gennin.atacar();
                        System.out.println();
                        System.out.println("Informações do ninja: ");
                        System.out.println();
                        gennin.mostrarInfos();
                        System.out.println();
                    }
                    else if(ninjas[i] instanceof Jonnin){ //chamando todos os métodos da classe Jonnin
                        Jonnin jonnin = (Jonnin) ninjas[i]; // Casting
                        jonnin.classificar();
                        System.out.println();
                        jonnin.treinarJutsu();
                        System.out.println();
                        jonnin.lutar();
                        System.out.println();
                        System.out.println("Atacando...");
                        jonnin.atacar();
                        System.out.println();
                        jonnin.liderarTime();
                        System.out.println();
                        System.out.println("Informações do ninja: ");
                        System.out.println();
                        jonnin.mostrarInfos();
                        System.out.println();
                    }
                }
            }
        }
        else { // Caso não tenha pelo menos 2 ninjas, como está na UML
            System.out.println("É necessário ter pelo menos 2 ninjas para listar");
        }
    }

    //Setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPaisLocalizado(String paisLocalizado){
        this.paisLocalizado = paisLocalizado;
    }

    public void setLider(String lider){
        this.lider = lider;
    }
    
    public void setNinjas(Ninja ninjas[]){
        this.ninjas = ninjas;
    }
}
