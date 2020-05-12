package br.usjt.app_previsoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.app_previsoes.model.Previsao;
import br.usjt.app_previsoes.service.DiasSemanaService;
import br.usjt.app_previsoes.service.PrevisoesService;
import br.usjt.app_previsoes.service.CidadesService;

@Controller
public class PrevisoesController {

	@Autowired
	private PrevisoesService previsoesService;

	@Autowired
	private DiasSemanaService diasService;

	@Autowired
	private CidadesService cidadesService;

	@GetMapping("/Previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("Previsoes");

		mv.addObject(new Previsao());
		mv.addObject("previsoes", previsoesService.listarTodos());
		mv.addObject("diasSemana", diasService.listarTodos());
		mv.addObject("cidades", cidadesService.listarTodos());

		return mv;
	}

	@PostMapping("/Previsoes")
	public String salvarPrevisao(Previsao previsao) {
		previsoesService.salvar(previsao);

		return "redirect:/Previsoes";
	}
}