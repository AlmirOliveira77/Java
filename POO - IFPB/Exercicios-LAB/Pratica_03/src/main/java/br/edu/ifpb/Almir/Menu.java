package br.edu.ifpb.Almir;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    private List<ContaCorrente> contas;{
        this.setContas(new ArrayList<ContaCorrente>());
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void setContas(List<ContaCorrente> contas) {
        this.contas = contas;
    }

    public void AdicionarConta(){
        Scanner s = new Scanner(System.in);
        ContaCorrente c = new ContaCorrente();

        System.out.println("---Adicioanar Conta Corrente---");
        System.out.print("  Informe o nome do titular da conta: ");
        String t = s.nextLine();
        c.setTitular(t);

        System.out.print("  informe o número da conta: ");
        int n = s.nextInt();
        c.setNumero(n);

        System.out.print("  informe o saldo da conta: ");
        double v = s.nextDouble();
        c.setSaldo(v);

        contas.add(n, c);
        MenuPrincipal();
    }

    public void ListarContas(){
        for(ContaCorrente i : contas){
            System.out.println("\n  Titular: "+i.getTitular() + ", Número da conta: "+i.getNumero() +
                    ", Saldo: "+ i.getSaldo());
        }
        MenuPrincipal();
    }

    public void BuscarConta(int numero){
        for(ContaCorrente i : contas) {
            if (i.getNumero() == numero) {
                System.out.println("\n  Titular: " + i.getTitular() + ", Número da conta: " + i.getNumero() +
                        ", Saldo: " + i.getSaldo());
            }
        }
        MenuPrincipal();
    }

    public void Operacões() {
        System.out.println("\n---Conta Corrente---");
        System.out.print("  Informe o número da conta: ");
        int num = s.nextInt();

        for (ContaCorrente i : contas) {
            if (i.getNumero() == num) {
                while (true) {
                    System.out.print("\n  1 - Sacar\n"+"  2 - Depositar\n"+"  3 - Saldo na tela\n"+
                            "  4 - Extrato na tela\n"+"  5 - Voltar\n"+"  Opção: ");
                    int op = s.nextInt();

                    if (op == 1) {
                        System.out.print("\n  informe a quantia: ");
                        double quantia = s.nextDouble();
                        i.Sacar(quantia);
                    }

                    else if (op == 2) {
                        System.out.print("\n  informe a quantia: ");
                        double quantia = s.nextDouble();
                        i.Depositar(quantia);
                    }

                    else if (op == 3) {
                        System.out.println("\n  Saldo: "+i.getSaldo());
                    }

                    else if (op == 4) {
                        System.out.println(i.Extrato());
                    }

                    else if (op == 5) {
                        MenuPrincipal();
                    }
                }

            }
        }
    }

    public void MenuPrincipal(){
        System.out.print("\n---Projeto Conta Corrente---\n"+"  O que deseja fazer\n"+
                "  1. Cadastrar nova conta\n"+"  2. Listar contas\n"+"  3. Buscar conta\n"+
                "  4. Operações com conta\n"+"  5. Sair\n"+"  Opção: ");
        int opcao = s.nextInt();

        if(opcao == 1){
            AdicionarConta();
        }

        else if(opcao == 2){
            ListarContas();
        }

        else if(opcao == 3){
            System.out.print("\n  Infome o número da conta: ");
            int num_conta = s.nextInt();
            BuscarConta(num_conta);
        }

        else if(opcao == 4){
            Operacões();
        }

        else if(opcao == 5){
            System.exit(0);
        }
    }

}
