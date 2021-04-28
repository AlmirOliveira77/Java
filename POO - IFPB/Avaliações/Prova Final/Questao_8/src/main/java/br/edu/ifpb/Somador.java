package br.edu.ifpb;
import java.util.Arrays;

public class Somador {

    public int[] Soma(int[] args) { //Mudei de String pra int pra poder receber direto sem precisar converter
        int[] num = new int[3];//cria o vetor de inteiros num
        for (int i = 0; i < args.length; i++) {
            num[i] = args[i];//recebe os valores e já guarda em num
        }
        int[] num2 = new int[num[2]];//cria o vetor auxiliar num2 do tamanho informado pela entrada
        for (int i = 0; i < num[2] ; i++) {
            num2[i] = num[0];   //na primeira iteração do for num2 recebe o valor
            num[0] = num[0] + num[1];  // da posição [0] de num e nas recebe sempre o valor
                                // somado com o valor de num[1] que é o valor a ser somado
        }
        return num2;//Retorna a o vertor num2 com o valor das somas
    }
}
