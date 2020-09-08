/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.ProductoBL;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
