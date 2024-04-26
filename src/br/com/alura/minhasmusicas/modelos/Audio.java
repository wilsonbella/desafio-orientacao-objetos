package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReptroducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReptroducoes() {
        return totalReptroducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReptroducoes++;
    }
}
