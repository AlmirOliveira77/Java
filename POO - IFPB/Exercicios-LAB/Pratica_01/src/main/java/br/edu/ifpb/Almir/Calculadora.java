package br.edu.ifpb.Almir;

public class Calculadora {
    public double Soma(double num_1, double num_2){
        return (num_1 + num_2);
    }

    public double Subtrair(double num_1, double num_2){
        return (num_1 - num_2);
    }

    public double Multiplicar(double num_1, double num_2){
        return (num_1 * num_2);
    }

    public double Dividir(double num_1, double num_2){
        return (num_1 / num_2);
    }

    @Override
    public String toString() {
        return "\n"+"  Calculadora IFPB, desenvolvida como" +
                "\n" + "  atividade prática da disciplina de POO";
    }
}
