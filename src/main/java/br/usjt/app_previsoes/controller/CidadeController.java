package br.usjt.app_previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.app_previsoes.model.*;
import br.usjt.app_previsoes.service.*;

@Controller
public class CidadeController {
	@Autowired
	private CidadeService cidadeServ;
	@GetMapping("/Cidades")
	public ModelAndView listarCidades() {
		
		ModelAndView mv = new ModelAndView("Cidades");
		List<Cidade> cidades = cidadeServ.listarTodos();
		mv.addObject("cidade", cidades);
		mv.addObject(new Cidade());
		
		return mv;
	}
	
	@PostMapping("/Cidades")
	public String salvar(Cidade cidade) {
		cidadeServ.salvar(cidade);
		return "redirect:/Cidades";
	}
}
