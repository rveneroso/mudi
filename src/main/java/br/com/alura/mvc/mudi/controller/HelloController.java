package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		// Usa o objeto model para colocar atributos na requisição da mesma forma como seria feito com
		// HttpServletRequest
		model.addAttribute("nome","Mundo cão");
		
		
		// O Spring vai usar a String retornada abaixo para devirar o nome da página para a qual a requisição
		// deve ser redirecionada. Assim, o fluxo seguirá para hello.html. Se a página não existir, uma exceção
		// será lançada.
		return "hello";
	}

}
