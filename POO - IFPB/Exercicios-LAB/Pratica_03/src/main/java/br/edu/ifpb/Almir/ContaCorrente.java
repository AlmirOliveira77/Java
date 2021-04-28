package br.edu.ifpb.Almir;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String titular, double saldo){
        this.setNumero(numero);
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public ContaCorrente(){
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero >= 0) {
            this.numero = numero;
        }
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public void Sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
    }

    public String Extrato(){
        return "\n  Nome: "+ this.getTitular()+"\n"+"  Número da conta: "+this.getNumero()+"\n"+
                "  Saldo: "+this.getSaldo();
    }
}
