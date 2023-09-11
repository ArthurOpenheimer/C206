package PCMania;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico [] hardwareBasico;
    MemoriaUSB MemoriaUSB;

    public Computador() {
        this.sistemaOperacional = new SistemaOperacional();
        
        this.hardwareBasico = new HardwareBasico[3];
        this.hardwareBasico[0] = new HardwareBasico();
        this.hardwareBasico[1] = new HardwareBasico();
        this.hardwareBasico[2] = new HardwareBasico();
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Processador: " + hardwareBasico[0].nome + " " + hardwareBasico[0].capacidade + " Mhz");
        System.out.println("Memória RAM: " + hardwareBasico[1].nome + " " + hardwareBasico[1].capacidade + " Gb");
        System.out.println("HD: " + hardwareBasico[2].nome + " " + hardwareBasico[2].capacidade + " Gb");
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo + " bits");
        System.out.println("Acompanhamento: " + MemoriaUSB.nome + " " + MemoriaUSB.capacidade + " Gb");
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.MemoriaUSB = musb;
    }
}