package br.usjt.app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.app_previsoes.model.Cidade;
import br.usjt.app_previsoes.repository.CidadesRepository;

@Service
public class CidadesService {
	@Autowired
	private CidadesRepository cidadesRepo;

	public void salvar(Cidade cidade) {
		cidadesRepo.save(cidade);
	}

	public List<Cidade> listarTodos(){
		return cidadesRepo.findAll();
	}
}