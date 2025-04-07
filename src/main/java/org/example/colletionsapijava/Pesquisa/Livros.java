package org.example.colletionsapijava.Pesquisa;

public class Livros {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livros(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String toString(){
        return "Titulo: " + titulo + ", autor do livro: " + autor + ", ano de publicacao: " + anoDePublicacao;
    }

}
