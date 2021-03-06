/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Pedido;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Xiomara
 */
public class PedidoDL {

    Conexion conexion = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(conexion.conectar());
    List datos;

    public List listar() {
        String sql = "SELECT p.*, pe.nombre1 as idPersona, pe.nombre2 as idPersona1,pe.apellido1 as idPersona2,pe.apellido2 as idPersona3 FROM pedido p, persona pe WHERE p.idPersona=pe.id ORDER BY p.id desc";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }

    public void insertar(Pedido p) {
        String sql = "INSERT INTO pedido (IdPersona, FechaEntrega, Observaciones, Imagen) VALUES (?,?,?,?)";
        jdbctemplate.update(sql, p.getIdPersona(), p.getFechaEntrega(), p.getObservaciones(), p.getImagen());
    }

    public void buscarid(Pedido p) {
        String sql = "INSERT INTO pedido (IdPersona, FechaEntrega, Observaciones, Imagen) VALUES (?,?,?,?)";
        jdbctemplate.update(sql, p.getIdPersona(), p.getFechaEntrega(), p.getObservaciones(), p.getImagen());
    }

    public List buscar(int id) {
        String sql = "SELECT * FROM pedido WHERE Id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }

    public void actualizar(Pedido p) {
        String sql = "UPDATE pedido SET FechaEntrega=?, Observaciones=?  WHERE Id=?";
        jdbctemplate.update(sql, p.getFechaEntrega(), p.getObservaciones(), p.getId());
    }

    public void actualizarestado(int id) {
        try {
            String sql = "INSERT INTO factura (IdPedido, Estado) values (" + id + ",0)";
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizar1(int id){
        try {
            String sql="UPDATE pedido SET Estado=1  WHERE Id=" + id;
        this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
           
    }

}
