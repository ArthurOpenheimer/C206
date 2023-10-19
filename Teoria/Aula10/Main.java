package Aula10;

public class Main {
    
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Rex", 100);
        Boi boi = new Boi("Boi", 100);
        Lontra lontra = new Lontra("Lontra", 100);

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();
    }
}
