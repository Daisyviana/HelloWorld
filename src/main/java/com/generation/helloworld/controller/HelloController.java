package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}

	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Daisy Viana!</b>";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Responsabilidade Pessoal<br />" + "Mentalidade de Crescimento<br />" + "Orientação ao Futuro<br />"
				+ "Persistência<br />" + "Comunicação<br />" + "Orientação aos Detalhes<br />"
				+ "Trabalho em Equipe<br />" + "Proatividade</b>";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos<br />" + "- Apender mais sobre spring<br />"
				+ "- Colher todos os conhecimentos sobre o MySql"; 
	}
}