package br.edu.ifpb;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;
import java.util.*;

public class RepoAeroportosTXT implements RepoAeroportosTXT_IF, Iterable<Aeroporto> {
    private Set<Aeroporto> lista = new HashSet<Aeroporto>();

    public String listarAeroportoPor(String letra) throws RemoteException {
        return null;
    }

    public String getNomeAeroporto(String ID) throws RemoteException {
        for (Aeroporto l : lista) {
            if (l.getID().equals(ID)) {
                return l.toString();
            }
        }
        return "Erro: Nenhum aeroporto foi encontrado";
    }

    public String editarNomeAeroporto(String ID, String nome) throws RemoteException {
       return null;
    }

    /* funcao para criar arquivo caso nao exista e ficar sempre truncando o arquivo existe para evitar espacos em branco */
    public void criarArquivo() {
        Path destino = Paths.get("aeroportos.txt");

        try {
            List<String> linhas = new ArrayList<>();
            for (Aeroporto aeroporto :
                    lista) {
                linhas.add(aeroporto.toString());
            }

            Files.write(destino,
                    linhas,
                    Charset.defaultCharset(),
                    StandardOpenOption.CREATE, // criar o arquivo, caso não exista
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println("Erro ao adicionar em arquivo");
        }
    }

    /* funcao para ler os dados do arquivo e colocar no conjunto */
    public void carregarArquivo(){
        Path pathOrigem = Paths.get("aeroportos.txt");
        Aeroporto aeroporto = null;

        // declarando variaveis q seria usadas para instanciar o objeto
        String ID, nome;

        try {
            List<String> linhas = Files.readAllLines(pathOrigem, Charset.defaultCharset());
            for (String linha :
                    linhas) {
                String[] palavras = linha.split(",");
                ID = palavras[0];
                nome = palavras[1];

                aeroporto = new Aeroporto(ID, nome);
                lista.add(aeroporto);
            }
            System.out.println("Arquivo carregado com sucesso");
        } catch (IOException e) {
            System.out.println("Não há arquivos para serem carregados");
        }
    }

    @Override
    public Iterator<Aeroporto> iterator() {
        return lista.iterator();
    }
}
