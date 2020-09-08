/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.PersonaDL;
import Model.Persona;
import java.util.List;

/**
 *
 * @author JEISSON
 */
public class PersonaBL {
    PersonaDL personaDL = new PersonaDL();
    
    public List listar(){
      return personaDL.listar();
    }
    public void insertar(Persona p){
         personaDL.insertar(p);
    }
    public List buscaDato(int id){
        return personaDL.buscaDato(id);
    }
    public void actualizar(Persona p){
        personaDL.actualizar(p);
    }
    public void eliminar (int id){
         personaDL.eliminar(id);
    }
    
}
