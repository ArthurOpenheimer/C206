package Aula7;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente [] cliente;

    public Conta(){
        setClientes(new Cliente[3]);
    }

    public Cliente[] getClientes() {
        return cliente;
    }

    public void setClientes(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo(){
        return saldo;
    }

    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public void sacar(float quantia){
        if (quantia <= getSaldo()){
            this.saldo -= quantia;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + getSaldo());
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
        System.out.println("Depósito realizado com sucesso");
        System.out.println("Saldo atual: " + getSaldo());
    }
    
}
