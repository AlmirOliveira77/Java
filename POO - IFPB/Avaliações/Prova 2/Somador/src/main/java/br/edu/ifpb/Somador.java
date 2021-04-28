package br.edu.ifpb;

public class Somador {

    public static int StrparaInt(String valor, String m) {
        try {
            return Integer.valueOf(valor);
        }
        catch (NumberFormatException e) {
            System.out.println(m);
            return 0;
        }
    }

    public static int numNegativo(int n, String m) {
        try {
            if (n >= 0) {
                return n;
            }
        }

        catch (NumberFormatException e) {
        }
        System.out.println(m);
        return 0;
    }


    public static void main(String[] args) {
        int soma = 0;
        int valor;

        for (int i = 0; i < args.length; i++) {
            String a = args[i];
            String msg = "A entrada "+a+" é invalida. Será desprezada.";
            valor = StrparaInt(a, msg);
            String msg2 = "A entrada "+valor+" é invalida. Será desprezada.";
            soma += numNegativo(valor, msg2);

        }

        System.out.println("O resultado da soma: "+soma);
    }

}
