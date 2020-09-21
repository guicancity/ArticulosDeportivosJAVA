/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.*;
import Model.DetallePedido;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JEISSON
 */
public class DetallePedidoController {

    ModelAndView mav = new ModelAndView();
    ProductoBL productoBL = new ProductoBL();
    DetallePedidoBL detallePedidoBL = new DetallePedidoBL();
    int id;
    List datos;

    @RequestMapping("detallePedido.txt")
    public ModelAndView Lista(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        datos = detallePedidoBL.listar(id);
        mav.addObject("lsDetallePedido", datos);
        mav.setViewName("indexDetallePedido");
        return mav;
    }

    @RequestMapping(value = "insertaDetallePedido.txt", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mav.addObject(new DetallePedido());
        datos = productoBL.listar();
        mav.addObject("lsProductos", datos);
        mav.setViewName("insertaDetallePedido");
        return mav;
    }

    @RequestMapping(value = "insertaDetallePedido.txt", method = RequestMethod.POST)
    public ModelAndView Agregar(HttpServletRequest request, DetallePedido dp) {
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int idProducto = Integer.parseInt( request.getParameter("idProducto"));
        int total = cantidad * 50;
        dp.setIdPedido(Integer.parseInt(request.getParameter("id")));
        dp.setCantidad(cantidad);
        dp.setPrecioventa(4);
        dp.setTotal(total);
     //   int precio = detallePedidoBL.traevalor(idProducto);
        detallePedidoBL.insertar(dp);
        return new ModelAndView("redirect:/pedido.txt");
    }

    @RequestMapping("deleteDetallePedido.txt")
    public ModelAndView Delete(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        detallePedidoBL.eliminar(id);
        return new ModelAndView("redirect:/pedido.txt");
    }
    
     @RequestMapping(value="editaDetallePedido.txt",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=detallePedidoBL.buscar(id);
        mav.addObject("lsDetallePedido",datos);
        mav.setViewName("editaDetallePedido");
        return mav;
    }
    
    @RequestMapping(value="editaDetallePedido.txt",method=RequestMethod.POST)
    public ModelAndView Editar(DetallePedido dp) {
        detallePedidoBL.actualizar(dp);
        return new ModelAndView("redirect:/pedido.txt");
    }
}
