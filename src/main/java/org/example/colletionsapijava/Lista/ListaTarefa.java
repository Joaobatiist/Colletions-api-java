package org.example.colletionsapijava.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for (Tarefa tarefa : this.listaTarefa) {
           if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
               tarefasParaRemover.add(tarefa);
           }
       }
       listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricaoTarefa() {

        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricaoTarefa();


    }
}
