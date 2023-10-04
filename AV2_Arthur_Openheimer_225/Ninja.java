package AV2_Arthur_Openheimer_225;

public abstract class Ninja {
    
    private static int numTotalNinjas = 0;
    private int registroNinja;
    private String nome;
    private int idade;
    private char rank;
    private double chakra;
    private int numMissoesCompletas;
    private int poder;

    private Jutsu jutsu; //Composição

    public Ninja(){
        numTotalNinjas++; //Incrementa o numero total de ninjas
        registroNinja = numTotalNinjas; //ID do ninja

        this.jutsu = new Jutsu(); //Composição
    }

    public void mostrarInfos(){
        System.out.println("Registro Ninja: " + registroNinja);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Rank: " + rank);
        System.out.println("Chakra: " + chakra);
        System.out.println("Numero de Missoes Completas: " + numMissoesCompletas);
        System.out.println("Poder: " + poder);
        System.out.println("Jutsu: ");
        jutsu.mostrarInfos();
    }

    public abstract void treinarJutsu(); //Método abstrato

    public void classificar(){
        if (numMissoesCompletas >= 2 && numMissoesCompletas <= 10) {
            rank = 'C';
        }
        else if(numMissoesCompletas >= 11 && numMissoesCompletas <= 20) {
            rank = 'B';
        }
        else if (numMissoesCompletas >= 21 && numMissoesCompletas <= 40) {
            rank = 'A';
        }
        else if (numMissoesCompletas >= 40) {
            rank = 'S';
        }
        else {
            System.out.println("Ninja com menos de 2 missões ainda não tem ranqueamento");
        }
    }

    //Getters

    public String getNome(){
        return this.nome;
    }

    public Jutsu getJutsu(){
        return this.jutsu;
    }

    public int getPoder(){
        return this.poder;
    }

    public double getChakra(){
        return this.chakra;
    }

    public static int getNumTotalNinjas(){
        return numTotalNinjas;
    }

    //Setters

    public void setPoder(int poder){
        this.poder = poder;
    }

    public void setChakra(double chakra){
        this.chakra = chakra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNumMissoesCompletas(int numMissoesCompletas){
        this.numMissoesCompletas = numMissoesCompletas;
    }

    public void setJutsu(Jutsu jutsu){
        this.jutsu = jutsu;
    }
}
