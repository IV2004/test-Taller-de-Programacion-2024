/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej3;

/**
 *
 * @author IgnacioV
 */
public class Personas {
    private String nombre;
    private int DNI,edad;
    
    public Personas(){
        
    }
    public Personas(String nombre,int DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return "Mi nombre es " + nombre + ", mi DNI es "+DNI+" y tengo " + edad + " años";

    }
    
}
