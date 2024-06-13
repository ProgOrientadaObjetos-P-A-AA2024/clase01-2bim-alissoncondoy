/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Docente {
     protected String nombres;
    protected String apellidos;
    protected String identificacion;
    protected int edad;

    
    public void establecerNombres(String nom){
        nombres = nom;
    }
  
    public void establecerApellidos(String ape){
        apellidos = ape;
    }
    
    public void establecerIdentificacion(String iden){
        identificacion = iden;
    }

    public void establecerEdad(int ed){
        edad = ed;
    }
    
    public String obtenerNombres(){
        return nombres;  
    }
 
    public String obtenerApellidos(){
        return apellidos; 
    }

    public String obtenerIdentificacion(){
        return identificacion; 
    }

    public int obtenerEdad(){
        return edad;
    }

}
