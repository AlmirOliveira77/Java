package br.edu.ifpb;

public class Calabreza implements Pizzaria{

    @Override
    public void Preparar() {
        System.out.println("Molho, queijo, calabreza, tomate e cebola");
    }

    @Override
    public void Assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void Cobrar() {
        System.out.println("20 reais");
    }
}
