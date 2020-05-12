package br.usjt.app_previsoes.controller;
import br.usjt.app_previsoes.model.Cidade;
import br.usjt.app_previsoes.repository.*;

import java.net.URI;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CidadeResource {

	@Autowired
	private CidadesRepository cidadesRepo;
	
	@GetMapping("/Cidades")
	public List<Cidade> listarCidades() {
		return cidadesRepo.findAll();
	}
	
	@PostMapping("/salvarCidade")
	public ResponseEntity<Cidade> salvar (@RequestBody Cidade cidade, HttpServletResponse
			response) {
		Cidade cid = cidadesRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().path("/{id}").buildAndExpand(cid.getId()).toUri();
		return ResponseEntity.created(uri).body(cid);
	}
	
	@GetMapping ("/Cidades/{latitude}/{longitude}")
	@SuppressWarnings("unchecked")
	public List<Cidade> encontraCidadePelasCoordenadas(@PathVariable String latitude, @PathVariable String longitude) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("select c from Cidades c where c.latitude = ?1 and c.latitude = ?2");
		List<Cidade> list = (List<Cidade>)query.getResultList();
		manager.close();
		JPAUtil.close();
		
		return list;
		
	}
	
	@GetMapping("Cidades/{nome}")
	public List<Cidade> encontraCidadePeloNome(@PathVariable String nome) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("select c from Cidades c where lower(c.nome) LIKE lower(?1%)");
		@SuppressWarnings("unchecked")
		List<Cidade> list = (List<Cidade>)query.getResultList();
		manager.close();
		JPAUtil.close();
		
		return list;
		
	}
	

	
}
