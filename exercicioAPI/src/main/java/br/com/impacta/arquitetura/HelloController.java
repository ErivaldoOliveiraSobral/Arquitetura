package br.com.impacta.arquitetura;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	String digaOla() {
		return "Ol� Mundos!";	
	}
}
