package web;

import domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

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
        var persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEmail("juanperez@gmail.com");
        persona1.setTelefono("1232133");

        // Creamos un objeto de la clase persona
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("karlagomer@gmail.com");
        persona2.setTelefono("42345463");

        //Array list de objetos tipo personas
        //	var personas = new Arraylist();
        //	personas.add(personas);
        //	personas.add(personas);

        var personas = Arrays.asList(persona1, persona2);

        //Llamamos el metodo persona, hacia el index
        model.addAttribute("personas", personas);
//		model.addAttribute("persona", persona1);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);

        //Nombre de la pagina que se visualiza en el navegador
        return "index";
    }

}
