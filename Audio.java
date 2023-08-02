package br.com.gabriel.audios;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas ;
    private int duracao;
    private int classificacao;


    public int getClassificacao() {
        return classificacao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes++;
    }
    public int TotalCurtidas() {
       return this.totalCurtidas++;
    }

}

