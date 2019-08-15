/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejemplo1;

/**
 *
 * @author michael cardenas
 */
public class Persona {

    /**
     * Atributo que ajsas
     */
    private String nombre;
    /**
     * atribbuto que guarda la edad
     */
    private String edad;
    
    /**
     * 
     * @param nombre
     * @param edad 
     */
       public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

     /**
      * metodo que retorna el nombre
      * @return 
      */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
       
       
    
    
}
