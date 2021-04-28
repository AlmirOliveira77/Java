package com.almir.testesoftware;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class CadastroTest {

    @Test
    public void testaCadastroVazio() {
        Cadastro c = new Cadastro();
        Assert.assertFalse(c.listarUsuarios());
    }

    @Test
    public void testaCriacaoCadastro() {
        Cadastro c = new Cadastro();
        Assert.assertTrue(c.cadastrarUsuario("Sócrates Brasileiro Sampaio de Souza Vieira de Oliveira", "19-02-1954", "senha123", "senha123", true));
        Assert.assertTrue(c.cadastrarUsuario("Almir de Oliveira Pereira", "23-02-1998", "password", "password", false));
        Assert.assertFalse(c.cadastrarUsuario("Humberto Gessinger", "24-12-1963", "InfinitaHighway", "SomosQuemPodemosSer", false));
    }

    @Test
    public void testaUsuariosCadastrados() {
        Cadastro c = new Cadastro();
        c.cadastrarUsuario("Sócrates Brasileiro Sampaio de Souza Vieira de Oliveira", "19-02-1954", "senha123", "senha123", true);
        c.cadastrarUsuario("Almir de Oliveira Pereira", "23-02-1998", "password", "password", false);
        c.cadastrarUsuario("Humberto Gessinger", "24-12-1963", "InfinitaHighway", "SomosQuemPodemosSer", false);
        Assert.assertTrue(c.listarUsuarios());
    }

}