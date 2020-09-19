/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.DetallePedidoDL;
import Model.DetallePedido;
import java.util.List;

/**
 *
 * @author JEISSON
 */
public class DetallePedidoBL {
    DetallePedidoDL detallePedidoDL = new DetallePedidoDL();
    
    public List listar(int id){
        return detallePedidoDL.listar(id);
    }
    public void insertar(DetallePedido dp){
       detallePedidoDL.insertar(dp);
    }
    
}
