/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.FacturaBL;
import Business.PedidoBL;
import Model.Factura;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "editarFactura.txt", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        datos = facturaBL.buscar(id);
        mav.addObject("lsFactura", datos);
        mav.setViewName("editarFactura");
        return mav;
    }

    @RequestMapping(value = "editarPersona.txt", method = RequestMethod.POST)
    public ModelAndView Editar(Factura f) {
        facturaBL.actualizar(f);
        return new ModelAndView("redirect:/factura.txt");
    }

}
