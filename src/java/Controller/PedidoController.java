/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.PedidoBL;
import Business.PersonaBL;
import Model.Pedido;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Xiomara
 */
public class PedidoController {
    ModelAndView mav=new ModelAndView();
    PedidoBL pedidoBL = new PedidoBL();
    PersonaBL personaBL = new PersonaBL();
    int id;
    List datos;
    
    @RequestMapping("pedido.txt")
    public ModelAndView Lista(){
        datos = pedidoBL.listar();
        mav.addObject("lspedido", datos);
        mav.setViewName("indexPedido");
        return mav;
}
    
    @RequestMapping(value="insertaPedido.txt",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Pedido());
        datos =  personaBL.listar();
        mav.addObject("lsPersona", datos);
        mav.setViewName("insertaPedido");
        return mav;
    }
    
    @RequestMapping(value="insertaPedido.txt",method=RequestMethod.POST)
    public ModelAndView Agregar(Pedido p){        
        pedidoBL.insertar(p);
        return new ModelAndView("redirect:/pedido.txt");
    }
}
    
    

