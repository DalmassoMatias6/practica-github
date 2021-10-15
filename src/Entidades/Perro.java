
package Entidades;

public class Perro {
    private String nombre;
    private String raza;
    private String apodo;
    private int edad;
    
//---------------------------------------------------------------------------------------
    //constructores

    public Perro() {
    }

    public Perro(String nombre, String raza, String apodo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.apodo = apodo;
        this.edad = edad;
    }
    
//---------------------------------------------------------------------------------------
    //metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
//----------------------------------------------------------------------------------
    //metodo ToString

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", apodo=" + apodo + ", edad=" + edad + '}';
    }
    
}
