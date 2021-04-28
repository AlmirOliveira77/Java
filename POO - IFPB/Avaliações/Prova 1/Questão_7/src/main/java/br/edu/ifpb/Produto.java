package br.edu.ifpb;

public class Produto {

    private int codigo;
    private String descricao;
    private String origem;
    private double preco;
    private int quantidade;


    public Produto(int codigo, String descrição, String origem) {
        this.codigo = codigo;
        this.descricao = descrição;
        this.origem = origem;
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(int codigo, String descrição, String origem, double preço, int quant) {
        this.codigo = codigo;
        this.descricao = descrição;
        this.origem = origem;
        this.preco = preço;
        this.quantidade = quant;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }


}