package pruebas2;

import java.time.LocalDate;

public class Perro {
    private String nombre;
    private LocalDate fecha_registro;


    public Perro (String nombre){
        this.nombre = nombre;
        fecha_registro = LocalDate.now();
    }
    public String comer() {
        return "El perro " + nombre +  " esta comiendo";

    }
    public String getNombre(){
        return nombre;
    }



}
