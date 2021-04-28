package br.edu.ifpb;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
    String host = (args.length < 1) ? "localhost" : args[0];

    Scanner input = new Scanner(System.in);
    String resposta = "";
    int op = 0;

    String ID = "";
    String novo_nome = "";
    String letra = "";

        do {
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            RepoAeroportosTXT_IF stub = (RepoAeroportosTXT_IF) registry.lookup("Aeroporto");
            System.out.print(menu());
            op = Integer.parseInt(input.nextLine());

            switch (op){
                case 1:
                    System.out.print("Informe a letra: ");
                    letra = input.nextLine();
                    resposta = stub.listarAeroportoPor(letra);
                    break;

                case 2:
                    System.out.print("Informe o ID do aeroporto: ");
                    ID = input.nextLine();
                    resposta = stub.getNomeAeroporto(ID);
                    break;

                case 3:
                    System.out.print("informe o ID do aeroporto que deseja editar: ");
                    ID = input.nextLine();
                    resposta = stub.editarAeroporto(ID, novo_nome);
                    break;

                case 4:
                    resposta = "Fim da execução";
                    break;

                    default:
                    resposta = "ERRO";
            }

            System.out.println(resposta+"\n\n");
        }
        catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }while ( op != 4 );
}

    static String menu(){
        return  "       Menu Principal\n"+
                "=============================\n" +
                "1. Listar Aeroportos por letra\n" +
                "2. Buscar Aeroporto por ID\n" +
                "3. Editar nome do aeroporto\n" +
                "4. Sair\n" +
                "   Digite sua sua opção: ";
    }
}
