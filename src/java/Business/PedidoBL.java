/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.PedidoDL;
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
   
   
}
