/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.DetallePedido;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author JEISSON
 */
public class DetallePedidoDL {
    Conexion conexion =  new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(conexion.conectar());
    List datos;
    
     public List listar( int id){
        String sql = "SELECT dp.Id,p.Nombre,dp.Cantidad,dp.PrecioVenta,dp.Total FROM detallepedido dp inner join producto p on p.Id = dp.IdProducto WHERE IdPedido = " + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    public void insertar(DetallePedido dp){
        String sql="INSERT INTO detallepedido (IdPedido, IdProducto, Cantidad, PrecioVenta, Total) VALUES (?,?,?,?,?)";
        try {
          jdbctemplate.update(sql,dp.getIdPedido(),dp.getIdProducto(),dp.getCantidad(), dp.getPrecioventa(),dp.getTotal());  
        } catch (Exception e) {
            System.out.print("Data.DetallePedidoDL.insertar()");
        }
        
    }
    
    public List buscar(int id) {
        String sql = "SELECT * FROM detallepedido WHERE Id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void actualizar(DetallePedido dp){
        String sql="UPDATE detallepedido SET Cantidad=? WHERE Id=?";
        jdbctemplate.update(sql, dp.getCantidad(), dp.getId());     
    }
  
    public void eliminar(int id){
        try {
            String sql = "DELETE FROM detallepedido WHERE Id =" + id;
        this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
           
    }
}
