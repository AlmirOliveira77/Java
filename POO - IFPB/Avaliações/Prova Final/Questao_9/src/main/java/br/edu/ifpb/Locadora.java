package br.edu.ifpb;

import java.util.LinkedList;

public class Locadora {
    private LinkedList<Cliente> listaCliente = new LinkedList<>();
    private LinkedList<DVD> listaDVDs = new LinkedList<>();
    private LinkedList<DVD> listaEmprestados = new LinkedList<>();

    public boolean CadastrarCliente(Cliente c2) {
        listaCliente.add(c2);
        return true;
    }
    public boolean CadastrarDVD(DVD dvd){
        listaDVDs.add(dvd);
        return true;
    }

    public boolean fazerEmprestimo(DVD c, DVD d){
        //listaEmprestados.add(c, d);
        return true;
    }

    public int contarDvdsEmprestados(){
        int cont = 0;
        for(DVD i : listaEmprestados){
            cont++;
        }
        return cont;
    }



}
