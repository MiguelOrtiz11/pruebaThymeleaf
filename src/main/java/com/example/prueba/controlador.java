package com.example.prueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class controlador {

	@GetMapping("/")
	public String inicio(Model model) {
		
		
	//var saludar = "Hola mundo";
		//log.debug("Ejecuando controlador Spring MVC");
		
		//Nombre de la pagina que se visualiza en el navegador
		return "index";
	}

}
