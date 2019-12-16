package br.edu.ifpb.distribuida.programacao.rest.dto;

public class AlbumRequest {
    private String nome;
    private int faixas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
}
