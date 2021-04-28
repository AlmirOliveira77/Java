package br.edu.ifpb;

import java.util.Objects;

public class Aeroporto {
    private String ID;
    private String nome;

    public Aeroporto(String ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aeroporto aeroporto = (Aeroporto) o;

        return ID.equals(aeroporto.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return this.getID() + ';' + this.getNome();
    }
}
