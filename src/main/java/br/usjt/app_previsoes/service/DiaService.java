package br.usjt.app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.app_previsoes.model.DiaSemana;
import br.usjt.app_previsoes.repository.DiaRepository;

@Service
public class DiaService {
	@Autowired
	private DiaRepository diaRepo;
	
	public void salvar(DiaSemana dia) {
		diaRepo.save(dia);
	}
	
	public List<DiaSemana> listarTodos(){
		List<DiaSemana> dias = diaRepo.findAll();
		
		return dias;
	}
}
