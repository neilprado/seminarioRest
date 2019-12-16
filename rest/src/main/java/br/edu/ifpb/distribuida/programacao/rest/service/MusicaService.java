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


    public Musica cadastrarMusica(){
        return null;
    }

    public Musica buscarMusica(){

        return null;
    }

    public Page<Musica> listarMusicas(){
        return null;
    }

    public Musica atualizarMusica(){
        return null;
    }

    public void removerMusica(){
    }
}
