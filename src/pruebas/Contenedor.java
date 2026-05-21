package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private String nombre_contenedor;
    private ArrayList<Persona> contenedor_personas;

    public Contenedor (String nombre_contenedor){
        this.nombre_contenedor = nombre_contenedor;
        contenedor_personas = new ArrayList<>();
    }

    public void agregar_personas (Persona persona){
        contenedor_personas.add(persona);
    }

    public String getNombre_contenedor (){
        return nombre_contenedor;
    }
    public List<Persona> getContenedorPersonas (){
        return contenedor_personas;
    }
}
