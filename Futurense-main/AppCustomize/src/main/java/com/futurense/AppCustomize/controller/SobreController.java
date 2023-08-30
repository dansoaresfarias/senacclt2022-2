package com.futurense.AppCustomize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SobreController {
	
	@RequestMapping("/sobre-nos")
	public String sobre()
	{
		return "sobre";
	}

}
