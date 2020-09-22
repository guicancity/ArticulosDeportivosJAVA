/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Factura;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Xiomara
 */
public class FacturaDL {
    Conexion conexion = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(conexion.conectar());
    List datos;
    
    public List listar(){
        String sql = "SELECT f.id idfactura,f.estado, pe.Nombre1,  p.IdPersona, p.FechaEntrega, p.Observaciones FROM factura f INNER JOIN pedido p ON  f.IdPedido= p.Id INNER JOIN persona pe ON p.idPersona = pe.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
        public List buscar(int id) {
        String sql = "SELECT * FROM factura WHERE Id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
  
   
        public void actualizar(int id){
        try {
            String sql="UPDATE factura SET Estado= 1  WHERE Id=" + id;
        this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
           
    }
   
}
