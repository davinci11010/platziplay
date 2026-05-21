package pruebas;

import java.time.LocalDate;

public class  Persona {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Ciudades ciudad_residencia;
    private int edad;
    private LocalDate fecha_registro;


    public Persona (String nombre, String apellido, String nacionalidad, Ciudades ciudad_residencia, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.ciudad_residencia = ciudad_residencia;
        this.validaredad(edad);
        this.fecha_registro = LocalDate.now();
    }


    public String mostrar_informacion(){
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Nacionalidad: " + nacionalidad + "\n" +
                "Ciudad de residencia: " + ciudad_residencia + "\n" +
                "Edad: " + edad;
    }



    private void validaredad(int edad) {
        if (edad > 0 && edad <= 120){
            this.edad =  edad;
        } else {
            throw new PruebasExeptionEdad(this.nombre);
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
