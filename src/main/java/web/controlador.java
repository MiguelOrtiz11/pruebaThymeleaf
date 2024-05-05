package web;

import Dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class controlador {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaDao.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }

}
