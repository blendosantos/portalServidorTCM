package br.gov.ba.tcm.portalServidorTCM.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.tcm.portalServidorTCM.model.Noticia;
import br.gov.ba.tcm.portalServidorTCM.repository.NoticiaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/noticias")
@Api(tags = {"NoticiaRest"}, value = "Operações do serviço de notícias")
public class NoticiaRest {

	@Autowired
	NoticiaRepository noticiaRepository;

	@GetMapping
	@ApiOperation(value = "Retorna uma lista de noticias")	
	public List<Noticia> listaNoticia(@RequestParam(required = false, defaultValue = "0") Integer page, @RequestParam(required = false, defaultValue = "10") Integer size) {
		Integer pageAtual = (page == null ? 0 : page);
		Integer sizeOf = (size == null ? 10 : size);
		Integer sizePage = 10;
		if(pageAtual != 0) {
			sizePage = pageAtual * sizeOf;
		}
		PageRequest pageable = PageRequest.of(pageAtual, sizePage);
		return noticiaRepository.findAll(pageable).toList();
	}

}
