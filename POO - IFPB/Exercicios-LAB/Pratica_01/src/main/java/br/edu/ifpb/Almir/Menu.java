package br.edu.ifpb.Almir;
import java.util.Scanner;

public class Menu {
    double num_1, num_2, opcao;
    Scanner entrada = new Scanner(System.in);
    Calculadora c = new Calculadora();

    public void capturarNum(){
        System.out.print("  Informe o primeiro valor: ");
        num_1 = entrada.nextDouble();
        System.out.print("  Informe o segundo valor: ");
        num_2 = entrada.nextDouble();
    }

    public void exibirMenu(){
        System.out.println("\nCalculadora IFPB");
        System.out.println("=======================");
        System.out.println("  1. Somar");
        System.out.println("  2. Subtrair");
        System.out.println("  3. Multiplicar");
        System.out.println("  4. Dividir");
        System.out.println("  5. Sobre");
        System.out.println("  6. Sair");
        System.out.print("  Digite uma opção: ");

        opcao = entrada.nextDouble();

        if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
            capturarNum();
        }


        if(opcao == 1){
            System.out.println("  Resultado: "+ c.Soma(num_1, num_2));
        }

        else if(opcao == 2){
            System.out.println("  Resultado: "+ c.Subtrair(num_1, num_2));
        }

        else if(opcao == 3){
            System.out.println("  Resultado: "+ c.Multiplicar(num_1, num_2));
        }

        else if(opcao == 4){
            System.out.println("  Resultado: "+ c.Dividir(num_1, num_2));
        }

        if(opcao == 5){
            System.out.println(c.toString());
        }

        if(opcao == 6){
            System.exit(0);
        }

    }


}
