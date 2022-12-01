package edu.senac.AppEventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.senac.AppEventos.model.Evento;
import edu.senac.AppEventos.model.Local;
import edu.senac.AppEventos.repository.EventoRepository;
import edu.senac.AppEventos.repository.LocalRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	@Autowired
	private LocalRepository lr;
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("evento/formEvento");
		Iterable<Local> locais = lr.findAll();
		mv.addObject("locais", locais);
		return mv;
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String salvarLocal(Evento evento) {		
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}

}
