package org.example.colletionsapijava.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContantos {
    private Set<Contato> contatos;

    public AgendaDeContantos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarContatos(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato AtualizarContato(String nome, int novoNumero) {
       Contato contatoAtualizado = null;
       for (Contato c : contatos) {
           if (c.getNome().equalsIgnoreCase(nome)) {
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
           }
       }
       return contatoAtualizado;


    }

    public static void main(String[] args) {
        AgendaDeContantos agenda = new AgendaDeContantos();


        agenda.adicionarContato("Joao", 719992225);
        agenda.adicionarContato("Joaquim", 719992225);
        agenda.adicionarContato("Joana", 719992225);
        agenda.adicionarContato("Hayana", 719992225);

        agenda.exibirContato();




        agenda.exibirContato();

        System.out.println(agenda.pesquisarContatos("Joao"));

    }
}
