package org.example.colletionsapijava.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int CodigoDeConvite;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return CodigoDeConvite == convidado.CodigoDeConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(CodigoDeConvite);
    }

    public Convidado(String nome, int codigoDeConvite) {
        this.nome = nome;
        CodigoDeConvite = codigoDeConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDeConvite() {
        return CodigoDeConvite;
    }

    public void setCodigoDeConvite(int codigoDeConvite) {
        CodigoDeConvite = codigoDeConvite;
    }
    @Override
    public String toString (){
        return "Nome: " + nome + ", Codigo de Convite: " + CodigoDeConvite;
    }

}
