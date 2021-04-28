package br.edu.ifpb;

public class Frango implements Pizzaria{
    @Override
    public void Preparar() {
        System.out.println("Frango, queijo e cebola");
    }

    @Override
    public void Assar() {
        System.out.println("20 minutos");
    }

    @Override
    public void Cobrar() {
        System.out.println("15 reais");
    }
}
