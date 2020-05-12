package br.usjt.app_previsoes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.usjt.app_previsoes.model.DiaSemana;
import br.usjt.app_previsoes.repository.DiasSemanaRepository;

@Service
public class DiasSemanaService {
	@Autowired
	private DiasSemanaRepository diasRepo;

	public List<DiaSemana> listarTodos(){
		return diasRepo.findAll();
	}
}