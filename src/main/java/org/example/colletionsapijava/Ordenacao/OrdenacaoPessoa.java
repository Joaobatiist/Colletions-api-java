package org.example.colletionsapijava.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {


    private List<Pessoa> pessoalist;

    public OrdenacaoPessoa() {
        pessoalist = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoalist.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalist);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenadoPorAltura(){
        List<Pessoa> pessoasPorAlt = new ArrayList<>(pessoalist);
        Collections.sort(pessoasPorAlt, new ComparetorPorAltura());
        return pessoasPorAlt;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("Maria", 30, 1.45);
        pessoa.adicionarPessoa("Joao", 13, 1.85);
        pessoa.adicionarPessoa("Mariana", 22, 1.75);
        pessoa.adicionarPessoa("Joana", 32, 1.50);


        System.out.println(pessoa.ordenadoPorIdade());
        System.out.println(pessoa.ordenadoPorAltura());

    }
}
