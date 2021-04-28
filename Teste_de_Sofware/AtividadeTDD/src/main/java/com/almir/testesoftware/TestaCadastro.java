package com.almir.testesoftware;

public class TestaCadastro {
    public static void main(String[] args) {
        Cadastro c =  new Cadastro();
        c.cadastrarUsuario("Almir de Oliveira Pereira", "23-02-1998", "password", "password", false);
        c.cadastrarUsuario("João da Silva", "10-01-1950", "senha", "Senha", true);
        c.listarUsuarios();
    }
}