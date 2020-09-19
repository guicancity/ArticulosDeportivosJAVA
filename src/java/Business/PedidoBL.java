/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.PedidoDL;
import Model.Pedido;
import java.util.List;

/**
 *
 * @author Xiomara
 */
public class PedidoBL {
    PedidoDL pedidoDL = new PedidoDL();
    
    public List listar(){
        return pedidoDL.listar();      
    }
    
     public void insertar(Pedido p){
         pedidoDL.insertar(p);
    }
    
     public List buscar(int id){
        return pedidoDL.buscar(id);
    }
    public void actualizar(Pedido p){
        pedidoDL.actualizar(p);
    }
   
}
