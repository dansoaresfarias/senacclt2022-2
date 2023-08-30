package com.futurense.AppCustomize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CotacaoController {

	@RequestMapping("/solicitar-cotacao")
	public String cotacao()
	{
		return "cotacao";
	}
}
