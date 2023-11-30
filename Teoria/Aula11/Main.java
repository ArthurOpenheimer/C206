package Aula11;

public class Main {
    
    public static void main(String[] args) {
        
        Mamifero cachorroMamifero = new Cachorro("Cachorro", 10);
        Mamifero boiMamifero = new Boi("Boi", 20);
        Mamifero lontraMamifero = new Lontra("Lontra", 30);

        Cachorro cachorro = new Cachorro("Rex", 10);
        Boi boi = new Boi("Bull", 20);
        Lontra lontra = new Lontra("Luna", 30);

        System.out.println("Mamiferos:");
        cachorroMamifero.emitirSom();
        cachorroMamifero.mostraInfo();
        System.out.println();

        boiMamifero.emitirSom();
        boiMamifero.mostraInfo();
        System.out.println();

        lontraMamifero.emitirSom();
        lontraMamifero.mostraInfo();
        System.out.println();

        System.out.println("Animais:");
        cachorro.emitirSom();
        cachorro.mostraInfo();
        System.out.println();

        boi.emitirSom();
        boi.mostraInfo();
        System.out.println();

        lontra.emitirSom();
        lontra.nadar();
        lontra.mostraInfo();
        System.out.println();
    }
}
