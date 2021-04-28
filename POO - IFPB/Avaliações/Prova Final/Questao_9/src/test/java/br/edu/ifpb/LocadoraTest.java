package br.edu.ifpb;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class LocadoraTest
{
    @Test
    public void FazerEmpretimo() {
        Locadora loc = new Locadora();
        Cliente c1 = new Cliente(100, "Ana");
        Cliente c2 = new Cliente(200, "Pedro");
        Cliente c3 = new Cliente(300, "Caio");

        Assert.assertTrue(loc.CadastrarCliente(c1));
        Assert.assertTrue(loc.CadastrarCliente(c2));
        Assert.assertTrue(loc.CadastrarCliente(c3));

        DVD d1 = new DVD(1, "Rambo");
        DVD d2 = new DVD(2, "StarWars");
        DVD d3 = new DVD(3, "Linda Mulher");

        Assert.assertTrue(loc.CadastrarDVD(d1));
        Assert.assertTrue(loc.CadastrarDVD(d2));
        Assert.assertTrue(loc.CadastrarDVD(d3));

        Assert.assertEquals(0, loc.contarDvdsEmprestados());

        //Assert.assertTrue(loc.fazerEmprestimo(c1, d1));
        //Assert.assertTrue(loc.fazerEmprestimo(c2, d2));
        //Assert.assertTrue(loc.fazerEmprestimo(c3, d1));

        //Assert.assertEquals(2, loc.contarDvdsEmprestados());

    }
}
