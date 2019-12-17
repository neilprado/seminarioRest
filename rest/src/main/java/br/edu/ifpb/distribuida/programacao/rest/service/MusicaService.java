package br.edu.ifpb.distribuida.programacao.rest.service;

import br.edu.ifpb.distribuida.programacao.rest.dto.MusicaRequest;
import br.edu.ifpb.distribuida.programacao.rest.model.Musica;
import br.edu.ifpb.distribuida.programacao.rest.repository.MusicaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MusicaService {
    private MusicaRepository repository;

    public MusicaService(MusicaRepository repository) {
        this.repository = repository;
    }

    public Musica cadastrarMusica(MusicaRequest request){
        Musica musica = new Musica();

        musica.setDuracao(request.getDuracao());
        musica.setGenero(request.getGenero());
        musica.setLetra(request.getLetra());
        musica.setNome(request.getNome());

        return this.repository.save(musica);
    }

    public Musica buscarMusica(Long id){
        Musica musica = this.repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Música não encontrada"));

        return musica;
    }

    public Page<Musica> listarMusicas(Pageable pageable){
        return this.repository.findAll(pageable);
    }

    public Musica atualizarMusica(Long id, MusicaRequest request){
        Musica musica = this.repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Música não encontrada"));

        musica.setDuracao(request.getDuracao());
        musica.setGenero(request.getGenero());
        musica.setLetra(request.getLetra());
        musica.setNome(request.getNome());

        return this.repository.save(musica);
    }

    public void removerMusica(Long id){
        Musica musica = this.repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Música não encontrada"));
        this.repository.delete(musica);
    }
}
