package br.edu.ifpb;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    RepoAeroportosTXT repoAeroportosTXT = new RepoAeroportosTXT();

    public RepoAeroportosTXT getRepoAeroportosTXT() {
        return repoAeroportosTXT;
    }

    public static void main(String[] args) {
        try {
            Servidor obj = new Servidor();
            RepoAeroportosTXT_IF stub = (RepoAeroportosTXT_IF) UnicastRemoteObject.exportObject(obj.getRepoAeroportosTXT(), 0);

            // carregando arquivos de books.txt na raiz de onde esta sendo rodado o servidor
            obj.getRepoAeroportosTXT().carregarArquivo();

            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("Aeroporto", stub);

            System.err.println("Servidor funcionando corretamente");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
