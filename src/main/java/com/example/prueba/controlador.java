package com.example.prueba;

import domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class controlador {

	@Value("${index.saludo}")
	private String saludo;

	@GetMapping("/")
	public String inicio(Model model) {
		
		
	var mensaje = "Mensaje enviado desde el controlador";
		//log.debug("Ejecuando controlador Spring MVC");


		// Creamos un objeto de la clase persona
		var persona =  new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setEmail("juanperez@gmail.com");
		persona.setTelefono("1232133");

		//Llamamos el metodo persona, hacia el index
		model.addAttribute("persona", persona);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("saludo", saludo);

		//Nombre de la pagina que se visualiza en el navegador
		return "index";
	}

}
