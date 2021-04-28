package br.edu.ifpb;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorProdutos {
    double menor = 1000000;
    double maior = 0;
    double soma = 0;
    double quant = 0;

    private List<Produto> listaDeProdutos;{
        this.setListaDeProdutos(new ArrayList<Produto>());
    }

    public ProcessadorProdutos(ArrayList<Produto> listaDeProdutos) {
        this.setListaDeProdutos(listaDeProdutos);
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void mostrarGraficoDistribuicaoPrecos() {

        System.out.println(("Gráfico de Distribuição de Preços"));
        System.out.println("---------------------------------");


        for (int i = 0; i <= 101; i += 10) {
            if (i == 0) {
                System.out.print(String.format("%02d-%02d: ", i, i + 9));
            }
            else if (i == 100) {
                System.out.print(String.format("  %d: ", i));
            }
            else {
                System.out.print(String.format("%d-%d: ", i, i + 9));
            }

            for (Produto p : this.getListaDeProdutos()) {
                if (p.getPreco() >= i && p.getPreco() <= i + 9) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

        for (Produto p : this.getListaDeProdutos()) {
            soma += p.getPreco();
            quant += 1;
            if (p.getPreco() < menor) {
                menor = p.getPreco();
            }
        }
        for (Produto p : this.getListaDeProdutos()) {
            if (p.getPreco() >= maior) {
                maior = p.getPreco();
            }
        }

        System.out.println("\nMenor preço: "+menor);
        System.out.println("Maior preço: "+maior);
        System.out.println("Média de preços: "+(soma/quant));
    }


}