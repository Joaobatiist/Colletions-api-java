package org.example.colletionsapijava.Lista;

public class Tarefa {



    private String descricao;


    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


   public String toString() {
        return descricao;
  }


}
