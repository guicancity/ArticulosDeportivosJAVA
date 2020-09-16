/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.PersonaBL;
import Model.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    
    
    @RequestMapping(value="insertaPersona.txt",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Persona());
        mav.setViewName("insertaPersona");
        return mav;
    } 
     @RequestMapping(value="insertaPersona.txt",method=RequestMethod.POST)
    public ModelAndView Agregar(Persona p){        
        personaBL.insertar(p);
        return new ModelAndView("redirect:/persona.txt");
    }
    
    @RequestMapping("deletePersona.txt")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        personaBL.eliminar(id);
        return new ModelAndView("redirect:/persona.txt"); 
    }
}
