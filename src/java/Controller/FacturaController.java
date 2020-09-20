/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.FacturaBL;
import Business.PedidoBL;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Xiomara
 */
public class FacturaController {

    ModelAndView mav = new ModelAndView();
    FacturaBL facturaBL = new FacturaBL();
    PedidoBL pedidoBL = new PedidoBL();
    int id;
    List datos;

    @RequestMapping("factura.txt")
    public ModelAndView Lista() {
        datos = facturaBL.listar();
        mav.addObject("lsFactura", datos);
        mav.setViewName("indexFactura");
        return mav;
    }

}
