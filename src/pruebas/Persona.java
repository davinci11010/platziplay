package pruebas;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private LocalDate fecha_registro;

    public Persona (String nombre, String apellido, String nacionalidad, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.validaredad(edad);
        this.fecha_registro = LocalDate.now();

    }
    public String mostrar_informacion(){
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Nacionalidad: " + nacionalidad + "\n" +
                "Edad: " + edad;
    }
    private void validaredad(int edad) {
        if (edad > 0 && edad <= 120){
            this.edad =  edad;
        } else {
            throw new RuntimeException("EDAD NO ES VALIDA");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }
}
