package br.edu.ifpb.distribuida.programacao.rest.repository;

import br.edu.ifpb.distribuida.programacao.rest.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
