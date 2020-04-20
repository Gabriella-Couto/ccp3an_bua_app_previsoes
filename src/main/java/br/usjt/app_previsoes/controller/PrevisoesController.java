package br.usjt.app_previsoes.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.usjt.app_previsoes.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.app_previsoes.model.DiaSemana;
import br.usjt.app_previsoes.model.Previsao;
import br.usjt.app_previsoes.model.Cidade;

@Controller
public class PrevisoesController {

	@Autowired
	private PrevisaoService service;
	private DiaService diaService;
	private CidadeService cidadeService;
	
	@GetMapping("/Previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("Previsoes");
		List<Previsao> previsoes = service.listarTodos();
		mv.addObject("previsoes", previsoes);
		mv.addObject(new Previsao());
		
		List<DiaSemana> diasDaSemana = diaService.listarTodos();
	    mv.addObject("diasDaSemana", diasDaSemana);
	    mv.addObject(new DiaSemana());
	    
	    List<Cidade> cidade = cidadeService.listarTodos();
	    mv.addObject("cidade", cidade);
	    mv.addObject(new Cidade());
		
		return mv;
	}
	
	@PostMapping("/Previsoes")
	public String salvarPrevisao(Previsao previsao) {
		service.salvar(previsao);
		
		return "redirect:/Previsoes";
	}
}
