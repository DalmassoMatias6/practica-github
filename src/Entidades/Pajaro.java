/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * 
 * @author José Pastrana by INDWARE 
 */
public class Pajaro {
    
    // Atributos 
    
    private String nombre; // 
    private String tipo ;  // Tipos de Aves: Pájaros, Rapaces, Corredoras, Zancudas, Gallináceas, 
    private String tamano; // Tamaño 
    
    // Constructores 
    
    public Pajaro(String nombre, String tipo, String tamano) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public Pajaro() {
    }
    
    // Setters 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    // Getters 

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamano() {
        return tamano;
    }
    
    // toString() 

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }

}
