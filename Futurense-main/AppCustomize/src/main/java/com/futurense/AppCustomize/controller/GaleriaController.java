package com.futurense.AppCustomize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GaleriaController {

	@RequestMapping("/galeria")
	public String galeria()
	{
		return "galeria";
	}
}
