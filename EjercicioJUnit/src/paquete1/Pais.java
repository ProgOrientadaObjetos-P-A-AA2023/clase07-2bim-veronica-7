/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario
 */
public class Pais {
    private String nombre;
    //private String 

    public void estaclecerNombre(String p) {
        nombre = p;
    }

    public String obtenerNombre() {
        return nombre;
    }
    
    // Junit es usado para hacer test, por defecto estos fallan, es necesario 
    // quitarlos y agregar nuestro codigo
}
