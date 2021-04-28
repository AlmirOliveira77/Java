package br.edu.ifpb;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RepoAeroportosTXT_IF extends Remote {
    String listarAeroportoPor( String letra) throws RemoteException;
    String getNomeAeroporto(String ID) throws RemoteException;
    String editarAeroporto(String ID, String novo_nome) throws RemoteException;
}
