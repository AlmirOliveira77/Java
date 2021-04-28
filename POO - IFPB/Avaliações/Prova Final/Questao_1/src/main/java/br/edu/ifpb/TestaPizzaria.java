package br.edu.ifpb;

public class TestaPizzaria {
    public static void main( String[] args ){
        Forno forno = new Forno();

        //Fabricar pizza de calabreza
        Calabreza pizzaCalabreza = new Calabreza();
        forno.Fabricar(pizzaCalabreza);

        //Fabricar pizza de frangp
        Frango pizzaFrango = new Frango();
        forno.Fabricar(pizzaFrango);
    }
}
