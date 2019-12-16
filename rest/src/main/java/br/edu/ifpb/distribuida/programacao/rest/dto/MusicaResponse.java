package br.edu.ifpb.distribuida.programacao.rest.dto;

import br.edu.ifpb.distribuida.programacao.rest.model.Musica;
import org.springframework.data.domain.Page;


public class MusicaResponse {
    private Long id;
    private String nome;
    private int duracao;
    private String letra;
    private String genero;
    private Long albumId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public static MusicaResponse from(Musica musica){
        MusicaResponse response = new MusicaResponse();

        response.setId(musica.getId());
        response.setDuracao(musica.getDuracao());
        response.setGenero(musica.getGenero());
        response.setLetra(musica.getLetra());
        response.setNome(musica.getNome());

        return response;
    }

    public static Page<MusicaResponse> from(Page<Musica> musicas){
        Page<MusicaResponse> responses = musicas.map(musica -> {
            MusicaResponse response = new MusicaResponse();

            response.setId(musica.getId());
            response.setDuracao(musica.getDuracao());
            response.setGenero(musica.getGenero());
            response.setLetra(musica.getLetra());
            response.setNome(musica.getNome());

            return response;
        });

        return responses;
    }
}
