/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.PersonaBL;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JEISSON
 */
public class PersonaController {
    ModelAndView mav = new ModelAndView();
    PersonaBL personaBL = new PersonaBL();
    int id;
    List datos;
    
    @RequestMapping("persona.txt")
    public ModelAndView Listar() {
        datos = personaBL.listar();
        mav.addObject("lsPersona", datos);
        mav.setViewName("listaPersonas");
        return mav;
    }
}
