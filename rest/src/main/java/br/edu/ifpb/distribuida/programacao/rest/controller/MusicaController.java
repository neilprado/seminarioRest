package br.edu.ifpb.distribuida.programacao.rest.controller;

import br.edu.ifpb.distribuida.programacao.rest.dto.MusicaRequest;
import br.edu.ifpb.distribuida.programacao.rest.dto.MusicaResponse;
import br.edu.ifpb.distribuida.programacao.rest.model.Musica;
import br.edu.ifpb.distribuida.programacao.rest.service.MusicaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


public class MusicaController {


    public ResponseEntity<MusicaResponse> cadastrarMusica(){
       return null;
    }

    public ResponseEntity<Page<MusicaResponse>> listarMusicas(){
        return null;
    }

    public ResponseEntity<MusicaResponse> buscarMusica(){
        return null;
    }

    public ResponseEntity<MusicaResponse> atualizarMusica(){ return null; }

    public ResponseEntity<Void> removerMusica(){
        return null;
    }
}
