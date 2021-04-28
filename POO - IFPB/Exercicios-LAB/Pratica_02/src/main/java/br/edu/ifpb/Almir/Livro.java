package br.edu.ifpb.Almir;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String categoria;

    public Livro(int codigo, String titulo, String autor, String categoria){
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setCategoria(categoria);
    }

    public Livro() {
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
