
package Entidades;

public class Pato {
    private String nombre;
    private int edad;
    private int cantPlumas;
    
//-----------------------------------------------------------------------------------
    //constructores

    public Pato() {
    }

    public Pato(String nombre, int edad, int cantPlumas) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantPlumas = cantPlumas;
    }
    
//-------------------------------------------------------------------------------------
    //metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantPlumas() {
        return cantPlumas;
    }

    public void setCantPlumas(int cantPlumas) {
        this.cantPlumas = cantPlumas;
    }
    
//--------------------------------------------------------------------------------
    //To string

    @Override
    public String toString() {
        return "Pato{" + "nombre=" + nombre + ", edad=" + edad + ", cantPlumas=" + cantPlumas + '}';
    }
    
}
