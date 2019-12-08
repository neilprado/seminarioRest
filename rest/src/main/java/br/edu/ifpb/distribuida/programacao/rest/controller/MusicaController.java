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

@RestController
public class MusicaController {
    private MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @PostMapping
    public ResponseEntity<MusicaResponse> cadastrarMusica(@Valid @RequestBody MusicaRequest request){
        Musica musica = this.musicaService.cadastrarMusica(request);
        return ResponseEntity.ok(MusicaResponse.from(musica));
    }

    @GetMapping
    public ResponseEntity<Page<MusicaResponse>> listarMusicas(Pageable pageable){
        Page<Musica> musicas = this.musicaService.listarMusicas(pageable);
        return ResponseEntity.ok(MusicaResponse.from(musicas));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicaResponse> buscarMusica(@Valid @PathVariable("id") long id){
        Musica musica = this.musicaService.buscarMusica(id);
        return ResponseEntity.ok(MusicaResponse.from(musica));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicaResponse> atualizarMusica(@Valid @PathVariable("id")long id,
                                                          @Valid @RequestBody MusicaRequest request){
        Musica musica = this.musicaService.atualizarMusica(id, request);
        return ResponseEntity.ok(MusicaResponse.from(musica));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerMusica(@Valid @PathVariable("id") Long id){
        this.musicaService.removerMusica(id);
        return ResponseEntity.ok().build();
    }
}
