package org.example.colletionsapijava.OperacoesBasicas;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoDeConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int CodigoDeConvidado){
        convidadosSet.add(new Convidado(nome, CodigoDeConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado codigo : convidadosSet){
            if(codigo.getCodigoDeConvite() == codigoConvite){
                convidadoParaRemover = codigo;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoDeConvidados conj = new ConjuntoDeConvidados();
        conj.adicionarConvidado("Joao", 112);
        conj.adicionarConvidado("rafael", 145);
        conj.adicionarConvidado("Breno", 167);
        conj.adicionarConvidado("Breno", 167);

        conj.removerConvidadoPorCodigoConvite(145);

        conj.exibirConvidados();
        System.out.println(conj.contarConvidados());
    }

}
