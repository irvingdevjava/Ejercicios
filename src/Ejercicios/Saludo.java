package Ejercicios;

public class Saludo {

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Saludo [nombre=" + nombre + ", apellido=" + apellido + "]";
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private String apellido;

    
}
