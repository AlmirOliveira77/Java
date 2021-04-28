package br.edu.ifpb;

import java.util.ArrayList;

public class ProcessadorProdutos {
    private ArrayList<Produto> lista;
    private ArrayList<String> aux1;
    private ArrayList<Double> aux2;


    public ProcessadorProdutos(ArrayList<Produto> lista) {
        this.lista = lista;
        aux1 = new ArrayList<>();
        aux2 = new ArrayList<>();
    }

    public void imprimir(){
        int cond = 1;
        for (Produto produto : lista) {
            for (String s : aux1) {
                if (produto.getOrigem() == s){
                    cond = 0;
                    int i = aux1.indexOf(produto.getOrigem());
                    double a = (produto.getPreco() * produto.getQuantidade());
                    aux2.add(i, aux2.get(i) + a);
                    aux2.remove(i+1);
                }
            }
            if (cond == 1){
                aux1.add(produto.getOrigem());
                aux2.add(produto.getPreco() * produto.getQuantidade());
            }
            cond = 1;
        }

        System.out.print("-----------Vendas por Cidade---------------" +
                "\n-Cidade          -  R$  -\n");

        for (int i = 0; i < aux1.size(); i++) {
            System.out.printf("%s          -  %.0f  -\n", aux1.get(i), aux2.get(i));
        }

        aux1.clear();
        aux2.clear();

        for (Produto produto : lista) {
            for (String s : aux1) {
                if (produto.getDescricao() == s) {
                    cond = 0;
                    int i = aux1.indexOf(produto.getDescricao());
                    double a = (produto.getQuantidade() * produto.getPreco());
                    aux2.add(i, aux2.get(i) + a);
                    aux2.remove(i+1);
                }
            }
            if (cond == 1) {
                aux1.add(produto.getDescricao());
                aux2.add(produto.getPreco() * produto.getQuantidade());
            }
            cond = 1;
        }

        System.out.print("-----------Vendas por Produto---------------" +
                "\n-Produto          -  R$  -\n");

        for (int i = 0; i < aux1.size(); i++) {
            System.out.printf("%s          -  %.0f  -\n", aux1.get(i), aux2.get(i));
        }


    }
}