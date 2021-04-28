package br.edu.ifpb;

public class Demo extends Notebook{
    private String precessador;

    public Demo(String marca, double preco, String processador) {
        super(marca, preco, processador);
        this.precessador = processador;
    }

    public Demo(String marca, String processador) {
        super(marca);
        this.precessador = processador;
    }
}
