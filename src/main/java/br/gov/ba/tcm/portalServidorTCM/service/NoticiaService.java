package br.gov.ba.tcm.portalServidorTCM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.gov.ba.tcm.portalServidorTCM.model.Noticia;
import br.gov.ba.tcm.portalServidorTCM.repository.NoticiaRepository;

public class NoticiaService {

	@Autowired
	NoticiaRepository noticiaRepository;

	public List<Noticia> listaNoticia() {
		return noticiaRepository.findAll();
	}

}
