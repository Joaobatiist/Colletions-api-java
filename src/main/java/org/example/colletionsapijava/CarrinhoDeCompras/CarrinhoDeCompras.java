package org.example.colletionsapijava.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<item> removido = new ArrayList<>();
        for (item i : itens) {
            if (i.getNome().equals(nome)) {
                removido.add(i);
            }
        }
        itens.removeAll(removido);
    }
    public void calcularTotal() {
        double total = 0;
        for (item valor : itens) {
            total += valor.getPreco();
        }
        System.out.println("Total: " + total);
    }
    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("pao", 10.00,1 );
        carrinho.adicionarItem("queijo", 20.00,1 );
        carrinho.adicionarItem("presunto", 10.00,1 );
        carrinho.removerItem("queijo");
        carrinho.exibirItens();
        carrinho.calcularTotal();
    }
}
