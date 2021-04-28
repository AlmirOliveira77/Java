package com.almir.testesoftware;

public class Usuario {

    private String nome;
    private String data_nac;
    private String senha;
    private String c_senha;
    private boolean grupo_risco;

    public Usuario(String nome, String dataNasc, String senha, String c_senha, boolean grupoRisco){
        setNome(nome);
        setData_nac(dataNasc);
        setSenha(senha);
        setConfirmaSenha(c_senha);
        setGrupo_risco(grupoRisco);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String name){
        nome = name;
    }

    public String getData_nac(){
        return data_nac;
    }
    public void setData_nac(String data){
        data_nac = data;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String s) {
         senha = s;
    }

    public String getConfirmaSenha(){
        return c_senha;
    }
    public void setConfirmaSenha(String cs) {
        c_senha = cs;
    }

    public boolean getGrupo_risco(){
        return grupo_risco;
    }
    public void setGrupo_risco(boolean gr){
        grupo_risco = gr;
    }
}