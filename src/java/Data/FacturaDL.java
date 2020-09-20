/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
        String sql = "SELECT factura.*,pedido.IdPersona, pedido.FechaEntrega, pedido.Observaciones FROM factura INNER JOIN pedido ON factura.IdPedido=pedido.Id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
}
