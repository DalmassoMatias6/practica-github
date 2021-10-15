

package Entidades;

/**
 * 
 * @author Javier Pizarro
 */
public class Caballo {
    
    private String raza;
    private String color;
    private Integer edad;
    private String nombreDueño;

    public Caballo() {
    }

    public Caballo(String raza, String color, Integer edad, String nombreDueño) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    @Override
    public String toString() {
        return "Caballo{" + "raza=" + raza + ", color=" + color + ", edad=" + edad + ", nombreDue\u00f1o=" + nombreDueño + '}';
    }
    
    
    

}
