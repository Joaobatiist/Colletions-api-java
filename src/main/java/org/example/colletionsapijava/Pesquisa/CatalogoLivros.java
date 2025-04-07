package org.example.colletionsapijava.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livros> livrosList;

    public CatalogoLivros() {
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        livrosList.add(new Livros(titulo, autor, anoDePublicacao));
    }

    public List<Livros> PesquisarPorautor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
      if(!livrosList.isEmpty()){
          for(Livros livro : livrosList){
              if(livro.getAutor().equals(autor)){
                  livrosPorAutor.add(livro);
              }
          }
      }
      return livrosPorAutor;

    }

    public List<Livros> PesquisaPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livros> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livros livro : livrosList) {
                if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }

            }
        }
        return livrosPorAno;

    }

    public Livros PesquisarPorTitulo(String titulo) {
        Livros livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livros livro : livrosList){
                if(livro.getTitulo().equals(titulo)){
                    livroPorTitulo = livro;
                   break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2011);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2012);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2016);
        catalogo.adicionarLivro("Livro 5", "Autor 5", 2018);

        System.out.println(catalogo.PesquisarPorautor("Autor 3"));
        System.out.println(catalogo.PesquisaPorIntervaloDeAno(2015, 2020));
        System.out.println(catalogo.PesquisarPorTitulo("Livro 1"));

    }
}

