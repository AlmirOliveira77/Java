package br.edu.ifpb;

import org.junit.*;

import java.rmi.RemoteException;

public class RepoAeroportosTXTTest {
    // Aeroportos
    static final Aeroporto l1 = new Aeroporto("ABE", "Allentown-Bethlehem-Easton International");

    static final Aeroporto l2 = new Aeroporto("ABQ", "Albuquerque International");

    static final Aeroporto clone_l1 = new Aeroporto("AGC", "Pittsburgh/Allegheny County");

    RepoAeroportosTXT repoAeroportosTXT = new RepoAeroportosTXT();

    @Test
    public void buscarAeroporto() throws RemoteException {
        String resposta1, resposta2;

        repoAeroportosTXT.editarNomeAeroporto(l1.getID(), l1.getNome());
        repoAeroportosTXT.editarNomeAeroporto(l2.getID(), l2.getNome());

        resposta1 = repoAeroportosTXT.getNomeAeroporto(l1.getID());
        resposta2 = repoAeroportosTXT.getNomeAeroporto(l2.getID());

        Assert.assertEquals(l1.toString(), resposta1);
        Assert.assertEquals(l2.toString(), resposta2);
    }

    @Test
    public void buscarAeroportoErro() throws RemoteException {
        String resposta1, resposta2;

        resposta1 = repoAeroportosTXT.getNomeAeroporto(l1.getID());
        resposta2 = repoAeroportosTXT.getNomeAeroporto(l2.getID());

        Assert.assertEquals("Aeroporto não encontrado", resposta1);
        Assert.assertEquals("Aeroporto não encontrado", resposta2);


    }
}
