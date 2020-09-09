/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Persona;
import java.util.List;
import org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author JEISSON
 */
public class PersonaDL {
    Conexion conexion = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(conexion.conectar());
    List datos;
    
    public List listar(){
        String sql = "SELECT Id,Nombre1,Nombre2,Apellido1,Apellido2,Direccion,Celular,TipoDocumento,NumeroDocumento,FechaNacimiento FROM persona";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    public void insertar(Persona p){
      String sql = "INSERT INTO persona(Nombre1,Nombre2,Apellido1,Apellido2,Direccion,Celular,TipoDocumento,NumeroDocumento,FechaNacimiento) VALUES (?,?,?,?,?,?,?,?,?)";
      jdbctemplate.update(sql,p.getNombre1(),p.getNombre2(),p.getApellido1(),p.getApellido2(), p.getDireccion(),p.getDireccion(),p.getCelular(),p.getTipoDocumento(),p.getFechaNacimiento()); 
    }
    
    public List buscaDato(int id){
       String sql = "SELECT Id,Nombre1,Nombre2,Apellido1,Apellido2,Direccion,Celular,TipoDocumento,NumeroDocumento,FechaNacimiento FROM persona WHERE Id = " + id;
       datos = jdbctemplate.queryForList(sql);
       return datos;  
    }
    public void actualizar(Persona persona){
        String sql = "UPDATE persona SET Nombre1 = ?,Nombre2 = ?,Apellido1 = ?,Apellido2 = ?,Direccion = ?,Celular = ?,TipoDocumento = ?,NumeroDocumento = ?,FechaNacimiento = ? WHERE Id = ? ";
        jdbctemplate.update(sql,persona.getNombre1(),persona.getNombre2(),persona.getApellido1(),persona.getApellido2(), persona.getDireccion(), persona.getCelular(),persona.getTipoDocumento(),persona.getNumeroDocumento(),persona.getFechaNacimiento(),persona.getId());
    }
    public void eliminar(int id){
        try {
             String sql = "DELETE FROM persona WHERE Id =" + id;
        this.jdbctemplate.update(sql);
        } catch (JdbcUpdateAffectedIncorrectNumberOfRowsException e) {
            System.err.println("error al eliminar " + e);
        }
       
        
    }
    
    
}
