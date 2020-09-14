/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Producto;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Xiomara
 */
public class ProductoDL {

    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;

    public List listar() {
        String sql = "SELECT * FROM producto";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Producto p){
        String sql="INSERT INTO producto (TipoProducto, Nombre, Descripcion, Valor, Stock) VALUES (?,?,?,?,?)";
        jdbctemplate.update(sql, p.getTipoProducto(), p.getNombre(), p.getDescripcion(), p.getValor(), p.getStock());
    }
    
    public List buscar(int id) {
        String sql = "SELECT * FROM producto WHERE Id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void actualizar(Producto p){
        String sql="UPDATE producto SET TipoProducto=?, Nombre=?, Descripcion=?, Valor=?, Stock=? WHERE Id=?";
        jdbctemplate.update(sql,p.getTipoProducto(),p.getNombre(), p.getDescripcion(), p.getValor(), p.getStock(), p.getId());     
    }
    
    public void eliminar(int id) {
        try {
            String sql = "DELETE FROM producto WHERE Id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
