package br.usjt.app_previsoes.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.app_previsoes.model.Previsao;
import br.usjt.app_previsoes.repository.PrevisoesRepository;

@Service
public class PrevisoesService {

	@Autowired
	private PrevisoesRepository previsoesRepo;

	public void salvar(Previsao previsao) {
		previsao.setData(new Date());
		previsoesRepo.save(previsao);
	}

	public List<Previsao> listarTodos(){
		return previsoesRepo.findAll();
	}
}