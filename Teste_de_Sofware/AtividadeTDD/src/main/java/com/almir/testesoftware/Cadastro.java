package com.almir.testesoftware;
import java.util.List;
import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Usuario> usuarios = null;

    public Cadastro(){
        usuarios = new ArrayList<>();
    }

    public boolean cadastrarUsuario(String nome, String dataNasc, String senha, String confirma_senha, boolean grupoRisco){
        if(senha.equals(confirma_senha)){
            System.out.println("=================================\nUSUÁRIO CADASTRADO COM SUCESSO!!!" +
                    "\n=================================\n");
            return usuarios.add(new Usuario(nome, dataNasc, senha, confirma_senha, grupoRisco));
        }
        else{
            System.out.println("=======================================================\n" +
                    "O cadastro não pode ser concluido, senhas não conferem.\n" +
                    "=======================================================\n");
            return false;
        }
    }

    public boolean listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("Não existem usúarios cadastrados!");
            return false;
        }
        else {
            System.out.println("Usuários Cadastrados:");
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario u = usuarios.get(i);
                System.out.println("\nUsuário " + (i+1) + "\n * Nome: "+ u.getNome());
                System.out.println(" * Data de nascimento: "+ u.getData_nac());
                System.out.println(" * Senha: "+ u.getSenha());
                System.out.println(" * Grupo de risco: "+ u.getGrupo_risco());
            }
            return true;
        }
    }
}
