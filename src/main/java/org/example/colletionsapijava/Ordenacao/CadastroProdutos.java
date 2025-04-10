package org.example.colletionsapijava.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> ExibirProdutoNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtos);
        return produtoPorNome;
    }

    public Set<Produto> ExibirProdutoPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtos);
        return produtoPorPreco;
    }
    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(12345,"banana", 12.00,10);
        cadastroProdutos.adicionarProduto(34521,"melao", 16.00,20);
        cadastroProdutos.adicionarProduto(54321,"laranja", 18.00,15);


        System.out.println(cadastroProdutos.ExibirProdutoNome());
      System.out.println(cadastroProdutos.ExibirProdutoPreco());

    }
}
