package edu.senac.AppEventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.senac.AppEventos.model.Local;
import edu.senac.AppEventos.repository.LocalRepository;

@Controller
public class LocalController {

	@Autowired
	private LocalRepository lr;

	@RequestMapping(value = "/cadastrarLocal", method = RequestMethod.GET)
	public String form() {
		return "local/formLocal";
	}
	
	@RequestMapping(value = "/cadastrarLocal", method = RequestMethod.POST)
	public String salvarLocal(Local local) {		
		lr.save(local);
		return "redirect:/cadastrarLocal";
	}

}
