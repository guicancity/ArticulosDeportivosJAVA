/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.PedidoBL;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Xiomara
 */
public class PedidoController {
    ModelAndView mav=new ModelAndView();
    PedidoBL pedidoBL = new PedidoBL();
    int id;
    List datos;
    
    @RequestMapping("pedido.txt")
    public ModelAndView Listra(){
        datos = pedidoBL.listar();
        mav.addObject("lspedido", datos);
        mav.setViewName("indexPedido");
        return mav;
}
}
    
    

