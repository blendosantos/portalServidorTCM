package br.gov.ba.tcm.portalServidorTCM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ba.tcm.portalServidorTCM.model.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

}
