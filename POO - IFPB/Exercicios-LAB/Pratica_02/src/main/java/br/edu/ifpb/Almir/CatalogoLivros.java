package br.edu.ifpb.Almir;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;{
        this.setlistalivros(new ArrayList<Livro>());
    }

    public List<Livro> getlistaLivros() {
        return listaLivros;
    }

    public void setlistalivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void AdicionarLivro(int codigo, Livro novoLivro) {
        listaLivros.add(codigo, novoLivro);
        System.out.println("Livro adicionado com sucesso!!");
    }

    public void RemoverLivro(int codigo) {
        listaLivros.remove(codigo);
        System.out.println("\nLivro removido com sucesso!!");
    }

    public void BuscarLivro(int codigo) {
        System.out.println("\nLivro encontrado!!");
        for (Livro l : getlistaLivros()) {
            if (l.getCodigo() == codigo) {
                System.out.println("Código: " + l.getCodigo() + ", " + "Título: " + l.getTitulo() + ", " +
                        "Autor: " + l.getAutor() + ", " + "Categoria: " + l.getCategoria() + ".");
            }
        }
    }

    public void ListarLivros() {
        System.out.println("\nLista de livros: ");
        for (Livro l : getlistaLivros()) {
            System.out.println("Código: " + l.getCodigo() + ", " + "Título: " + l.getTitulo() + ", " +
                    "Autor: " + l.getAutor() + ", " + "Categoria: " + l.getCategoria() + ".");
        }
    }

}
