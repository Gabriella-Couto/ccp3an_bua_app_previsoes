package br.usjt.app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.app_previsoes.model.Cidade;
import br.usjt.app_previsoes.repository.CidadeRepository;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository cidadeRepo;
	
	public void salvar(Cidade cidade) {
		cidadeRepo.save(cidade);
	}
	
	public List<Cidade> listarTodos(){
		List<Cidade> cidades = cidadeRepo.findAll();
		
		return cidades;
	}
}
