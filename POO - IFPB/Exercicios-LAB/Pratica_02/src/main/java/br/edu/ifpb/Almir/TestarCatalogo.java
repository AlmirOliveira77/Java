package br.edu.ifpb.Almir;

public class TestarCatalogo {
    public static void main( String[] args ) {
        CatalogoLivros l = new CatalogoLivros();

        Livro novoLivro1 = new Livro();
        novoLivro1.setCodigo(0);
        novoLivro1.setTitulo("Biblia");
        novoLivro1.setAutor("Varios");
        novoLivro1.setCategoria("Religioso");

        Livro novoLivro2 = new Livro();
        novoLivro2.setCodigo(1);
        novoLivro2.setTitulo("A arte da guerra");
        novoLivro2.setAutor("Sun Tzu");
        novoLivro2.setCategoria("Ficção");

        Livro novoLivro3 = new Livro();
        novoLivro3.setCodigo(2);
        novoLivro3.setTitulo("A revolução dos bichos");
        novoLivro3.setAutor("Geore Orwell");
        novoLivro3.setCategoria("Ficção");

        l.AdicionarLivro(0, novoLivro1);
        l.AdicionarLivro(1, novoLivro2);
        l.AdicionarLivro(2, novoLivro3);
        l.ListarLivros();
        l.BuscarLivro(2);
        l.RemoverLivro(0);
        l.ListarLivros();
    }
}
