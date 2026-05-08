//plataforma
package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Pelicula> contenido;
    public Plataforma (String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();

    }
    public void agregar(Pelicula elemento) {
        this.contenido.add(elemento);
    }


    public void eliminar(Pelicula elemento){
        this.contenido.remove(elemento);
    }

    public void buscarpelicula (String nombrepelicula) {
        int cantidad_peliculas_almacenadas = contenido.size();
        int cantidad_iteracion_busqueda = 0;

        for (int i = 0 ; i < contenido.size() ; i ++){
            if (nombrepelicula.equals(contenido.get(i).getTitulo())){
                System.out.println("LA PELICULA SI SE ENCUENTRA EN LA BASE DE DATOS  🟩");
            } else {
                cantidad_iteracion_busqueda +=1;
            }
        }
        if (cantidad_iteracion_busqueda == cantidad_peliculas_almacenadas){
            System.out.println("❌❌LA PELICULA NO SE ENCUENTRA EN LA BASE DE DATOS❌❌");
        }
    }


    public void mostrartitulos(){
        for (int i = 0; i < contenido.size(); i++) {
            System.out.println(contenido.get(i).getTitulo());
        }
    }

    //GETTERS
    public String getNombre(){
        return  nombre;
    }

    public List<Pelicula> getcontenido() {
        return contenido;
    }

}