package br.edu.ifpb.distribuida.programacao.rest.dto;

import br.edu.ifpb.distribuida.programacao.rest.model.Album;
import org.springframework.data.domain.Page;

public class AlbumResponse {
    private Long id;
    private String nome;
    private int faixas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public static AlbumResponse from(Album album){
        AlbumResponse response = new AlbumResponse();

        response.setFaixas(album.getFaixas());
        response.setId(album.getId());
        response.setNome(album.getNome());

        return response;
    }

    public static Page<AlbumResponse> from(Page<Album> albums){
        Page<AlbumResponse> responses = albums.map(album -> {
            AlbumResponse response = new AlbumResponse();

            response.setFaixas(album.getFaixas());
            response.setId(album.getId());
            response.setNome(album.getNome());

            return response;
        });

        return responses;
    }
}
