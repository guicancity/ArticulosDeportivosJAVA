/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.FacturaDL;
import Model.Factura;
import java.util.List;

/**
 *
 * @author Xiomara
 */
public class FacturaBL {
    
    FacturaDL facturaDL=new FacturaDL();
    
    public List listar(){
        return facturaDL.listar();
    }
    
      public List buscar(int id){
        return facturaDL.buscar(id);
    }
    public void actualizar(int id){
        facturaDL.actualizar(id);
    }
    
}
