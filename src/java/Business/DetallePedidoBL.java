/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.DetallePedidoDL;
import Model.DetallePedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JEISSON
 */
public class DetallePedidoBL {
    DetallePedidoDL detallePedidoDL = new DetallePedidoDL();
    ResultSet rs;
    
    public List listar(int id){
        return detallePedidoDL.listar(id);
    }
    public void insertar(DetallePedido dp){
       detallePedidoDL.insertar(dp);
    }
    
    public List buscar(int id){
        return detallePedidoDL.buscar(id);
    }
    public void actualizar(DetallePedido dp){
        detallePedidoDL.actualizar(dp);
    }
    public void eliminar(int i){
        detallePedidoDL.eliminar(i);
        
    }
    public DetallePedido valorProducto(int id) throws SQLException{
        rs = detallePedidoDL.valorProducto(id);
       while(rs.next()){
           DetallePedido dp = new DetallePedido();
           
           dp.setPrecioventa(rs.getInt("Valor"));
           return dp;
       }
        return null;
    } 
}
