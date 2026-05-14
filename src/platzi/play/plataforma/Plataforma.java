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

    //PRIMERA INSTANCIA
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
    //SEGUNDA INSTANCIA
    public String buscarpeliculamejorado(String nombre_pelicula) {
        String ficha_pelicula_encontrada = null;
        for (int i = 0; i < contenido.size(); i++) {
            if (contenido.get(i).getTitulo().equals(nombre_pelicula)) {
                ficha_pelicula_encontrada = contenido.get(i).obtenerFichaTecnica();
            }
        }
        return ficha_pelicula_encontrada;
    }

    //TERCERA INSTANCIA
    public void mostrarportitulosplatzi (String titulo){
        contenido.forEach(i -> System.out.println(i.getTitulo()));
    }


    public ArrayList<Pelicula> buscarporgenero (String genero){
        ArrayList<Pelicula>listapeliculasgenero = new ArrayList<>();
        for (int i = 0 ; i < contenido.size(); i++){
            if (contenido.get(i).getGenero().equals(genero)){
                listapeliculasgenero.add(contenido.get(i));
            }
        }
        return listapeliculasgenero;
    }

    public void eliminarpelicula (String nombrepelicula) {
        String registronombrepelicula = "";
        for (int i = 0 ; i < contenido.size(); i++) {
            if (nombrepelicula.equals(contenido.get(i).getTitulo())){
                registronombrepelicula = contenido.get(i).getTitulo();
                contenido.remove(contenido.get(i));
            }
        }
        System.out.println("LA PELICULA (" + registronombrepelicula + ") HA SIDO ELIMINADA DE LA BASE DE DATOS🔵");

    }

    public void mostrartitulos(){
        for (Pelicula pelicula : contenido) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public List<String> mostrartitulosconstream(){
        return contenido.stream().map(pelicula -> pelicula.getTitulo()).toList();
    }

    public int getduraciontotal () {
        int suma = 0;
        for (int i = 0 ; i < contenido.size() ; i ++) {
            suma =  suma + contenido.get(i).getDuracion();
        }
        return suma;
    }

    public int getduracionplatzi () {
        return contenido.stream().mapToInt(Pelicula::getDuracion).sum();
    }

    //GETTERS
    public String getNombre(){
        return  nombre;
    }
    public List<Pelicula> getcontenido() {
        return contenido;
    }
}