package br.edu.ifpb;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RepoAeroportosTXT_IF extends Remote {
    String getNomeAeroporto(String ID ) throws RemoteException;
    String editarNomeAeroporto(String ID, String nome) throws RemoteException;
    String listarAeroportoPor(String letra) throws RemoteException;
}

