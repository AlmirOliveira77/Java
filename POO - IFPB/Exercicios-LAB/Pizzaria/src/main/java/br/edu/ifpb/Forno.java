package br.edu.ifpb;

public class Forno {
    public void Fabricar(Pizzaria pizza){
        //Fabrica qualquer sabor de pizza
        pizza.Preparar();
        pizza.Assar();
        pizza.Cobrar();
    }
}
