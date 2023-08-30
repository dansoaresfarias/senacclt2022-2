package com.futurense.AppCustomize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormsController {
	
	@RequestMapping("/forms/placa-circular")
	public String placaCircular()
	{
		return "loja/placaCircular";
	}
	
	@RequestMapping("/forms/placa-quadrada")
	public String placaQuadrada()
	{
		return "loja/placa-quadrada";
	}
	
	@RequestMapping("/forms/placa-diamante")
	public String placaDiamante()
	{
		return "loja/placa-diamante";
	}
	
	@RequestMapping("/forms/placa-octagona")
	public String placaOctagona()
	{
		return "loja/placa-octagona";
	}
	
	@RequestMapping("/forms/placa-retangular")
	public String placaRetangular()
	{
		return "loja/placa-retangular";
	}
	
	@RequestMapping("/forms/placa-retangular-horizontal")
	public String placaRetangularH()
	{
		return "loja/placa-retangular-horizontal";
	}
	
	@RequestMapping("/obrigado")
	public String obrigado()
	{
		return "obrigado";
	}
	

}
