package br.edu.ifpb;

public class Cliente {
    private int matricula;
    private String nome;

    public Cliente(){
    }

    public Cliente(int matricula, String nome){
        this.setMatricula(matricula);
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
