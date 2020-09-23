/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.*;
import Model.DetallePedido;
import java.sql.SQLException;
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
    public ModelAndView Agregar(HttpServletRequest request, DetallePedido dp) throws SQLException {
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int idProducto = Integer.parseInt( request.getParameter("idProducto"));
        int id = Integer.parseInt( request.getParameter("id"));
        dp = detallePedidoBL.valorProducto(idProducto);
        int precio = dp.getPrecioventa();
        int total = cantidad * precio;
        dp.setIdProducto(idProducto);
        dp.setIdPedido(id);
        dp.setCantidad(cantidad);
        dp.setPrecioventa(precio);
        dp.setTotal(total);
        detallePedidoBL.insertar(dp);
        return new ModelAndView("redirect:/detallePedido.txt?id="+id);
    }

    @RequestMapping("deleteDetallePedido.txt")
    public ModelAndView Delete(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        int idpedido = Integer.parseInt(request.getParameter("idpedido"));
        detallePedidoBL.eliminar(id);
        return new ModelAndView("redirect:/detallePedido.txt?id="+ idpedido);
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
    public ModelAndView Editar(HttpServletRequest request,DetallePedido dp) {
        int cantidad = dp.getCantidad();
        int precio = Integer.parseInt(request.getParameter("pp"));
        int total = cantidad * precio;
        dp.setTotal(total);
        detallePedidoBL.actualizar(dp);
        return new ModelAndView("redirect:/pedido.txt");
    }
}
