package com.olamundo.ola.crontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class olaControle {
	
	@GetMapping
	public String hello() {
		return "Olá pessoas!!  fazer essa atividade foi um pouco dificil mas com bastante atenção aos detalhes e persistencia, consegui faze-la kk";
	}

}
