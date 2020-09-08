/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ProductoDL;
import Model.Producto;
import java.util.List;

/**
 *
 * @author Xiomara
 */
public class ProductoBL {
    ProductoDL productodl=new ProductoDL();
    
    public List listar(){
        return productodl.listar();      
    }
    
    public void insertar (Producto p){
        productodl.insertar(p);     
    }
    
    public List buscar(int id){
        return productodl.buscar(id);
    }

    public void actualizar (Producto p){
        productodl.actualizar(p);
    }
    
    public void eliminar (int id){
        productodl.eliminar(id);
    }
}
