package br.edu.ifpb.distribuida.programacao.rest.repository;

import br.edu.ifpb.distribuida.programacao.rest.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
