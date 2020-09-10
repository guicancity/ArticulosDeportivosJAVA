/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.ProductoBL;
import Model.Producto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Xiomara
 */
public class ProductoController {
    ModelAndView mav= new ModelAndView();
    ProductoBL productobl= new ProductoBL();
    int id;
    List datos;
    
    @RequestMapping("producto.txt")
    public ModelAndView Listar(){
        datos=productobl.listar();
        mav.addObject("lsProductos",datos);
        mav.setViewName("indexProducto");
        return mav;
    }
    
    @RequestMapping(value="insertaProducto.txt",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Producto());
        mav.setViewName("insertaProducto");
        return mav;
    }
    
    @RequestMapping(value="insertaProducto.txt",method=RequestMethod.POST)
    public ModelAndView Agregar(Producto p){        
        productobl.insertar(p);
        return new ModelAndView("redirect:/producto.txt");
    }
    
    @RequestMapping("deleteProducto.txt")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        productobl.eliminar(id);
        return new ModelAndView("redirect:/producto.txt"); 
    }
    
}
