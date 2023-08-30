package com.futurense.AppCustomize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojaController {
	
	@RequestMapping("/loja")
	public String loja()
	{
		return "loja/loja";
	}

}
