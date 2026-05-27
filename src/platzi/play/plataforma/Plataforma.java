//plataforma
package platzi.play.plataforma;

import platzi.play.contenido.Documental;
import platzi.play.contenido.Genero;
import platzi.play.contenido.Pelicula;
import platzi.play.contenido.ResumenContenido;
import platzi.play.exepcion.PeliculaExistenteException;

import javax.print.Doc;
import java.awt.image.AreaAveragingScaleFilter;
import java.sql.SQLOutput;
import java.util.*;

public class Plataforma {
    private String nombre;
    private List<Pelicula> contenido;
    private Map<Pelicula, Integer> visualizaciones;
    public Plataforma (String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
        visualizaciones = new HashMap<>();

    }
    public void agregar(Pelicula elemento) {
        if (buscarportitulo(elemento.getTitulo()) == true) {
            throw new PeliculaExistenteException(elemento.getTitulo());
        } else {
            contenido.add(elemento);
        }

    }

    public void reproducir(Pelicula contenido) {
        int conteoActual = visualizaciones.getOrDefault(contenido,0);
        System.out.println(contenido.getTitulo() + " ha sido reproducido: " + conteoActual + " veces");
        visualizaciones.put(contenido, conteoActual + 1);
        contenido.reproducir();
    }


    private boolean buscarportitulo(String titulo){
        for (int i = 0 ; i < contenido.size(); i ++){
            if (contenido.get(i).getTitulo().equals(titulo)){
                return true;
            }
        }
        return false;
    }

    public List<Pelicula> mostarlistaporgenetoconstream (Genero genero) {
        var n =  contenido.stream()
                .filter(i -> i.getGenero().equals(genero))
                .toList();
        return n;
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


    public ArrayList<Pelicula> buscarporgenero (Genero genero){
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
        contenido.forEach(i -> {
            System.out.println("--" + i.getTitulo() + "--");
        });

    }

    public List<String> mostartitulosconmap() {
        // de cada elemento de contenido agarra el titulo y lo convertis en una lista
        return contenido.stream().map( i-> i.getTitulo()).toList();
    }
    public void buscartitulostream (String titulo){
        contenido.stream().
                filter(i -> i.getTitulo().equals(titulo)).
                findFirst().
                orElse(null);
    }

    public List<Pelicula> getpopulares(){
        ArrayList<Pelicula> lista_mejores_peliculas = new ArrayList<>();
        ArrayList<Pelicula> lista_copia_contenido = (ArrayList<Pelicula>) contenido;
        ArrayList<Double> lista_maximos = new ArrayList<>();
        for (int i = 0 ; i < lista_copia_contenido.size(); i++) {
            lista_maximos.add(lista_copia_contenido.get(i).getCalificacion());
        }
        int size_lista_copia_contenido = lista_copia_contenido.size();
        while (size_lista_copia_contenido > 0) {
            double maximo = Collections.max(lista_maximos);
            for (int i =  0 ; i < lista_copia_contenido.size(); i++) {
                if (lista_copia_contenido.get(i).getCalificacion() == maximo) {
                    lista_mejores_peliculas.add(lista_copia_contenido.get(i));
                    lista_copia_contenido.remove(lista_copia_contenido.get(i));
                }
            }
            size_lista_copia_contenido -= 1;
            lista_maximos.remove(maximo);
        }
        return lista_mejores_peliculas;
    }

    public String get_pelicula_mas_larga () {
        ArrayList<Integer> lista_contenedora_duraciones = new ArrayList<>();
        String pelicula_mayor_duracion = "";
        for (int i = 0 ; i < contenido.size(); i++){
            lista_contenedora_duraciones.add(contenido.get(i).getDuracion());
        }
        int mayor = Collections.max(lista_contenedora_duraciones);
        for (int j =  0 ; j < contenido.size(); j++){
            if (contenido.get(j).getDuracion() == mayor){
                System.out.println("--PELICULA CON MAYOR DURACION--");
                pelicula_mayor_duracion = contenido.get(j).obtenerFichaTecnica();
            } else {
                continue;
            }
        }
        return pelicula_mayor_duracion;
    }
    public String get_pelicula_mas_corta () {
        ArrayList<Integer> lista_contenedora_duraciones = new ArrayList<>();
        String pelicula_menor_duracion = "";
        for (int i = 0 ; i < contenido.size(); i++){
            lista_contenedora_duraciones.add(contenido.get(i).getDuracion());
        }
        int mayor = Collections.min(lista_contenedora_duraciones);
        for (int j =  0 ; j < contenido.size(); j++){
            if (contenido.get(j).getDuracion() == mayor){
                System.out.println("--PELICULA CON MENOR DURACION--");
                pelicula_menor_duracion = contenido.get(j).obtenerFichaTecnica();
            }
        }
        return pelicula_menor_duracion;

    }
    public void clasificar() {
        for (int i = 0 ; i < contenido.size(); i++) {
            System.out.println("---------");
            if (contenido.get(i) instanceof Documental){
                System.out.println(contenido.get(i).getTitulo() + " --> Documental");
            } else if (contenido.get(i) instanceof Pelicula){
                System.out.println(contenido.get(i).getTitulo() + " --> Pelicula");
            }
            System.out.println("---------");
        }
    }

    public int getduraciontotal () {
        int suma = 0;
        for (int i = 0 ; i < contenido.size() ; i ++) {
            suma =  suma + contenido.get(i).getDuracion();
        }
        return suma;
    }
    public List<Pelicula> buscarporgenero_stream (String genero) {
        return contenido.stream()
                .filter( i -> i.getGenero().equals(genero))
                .toList();
    }

    public List<ResumenContenido> getResumenes(){
        return contenido.stream()
                .map(contenido -> new ResumenContenido(contenido.getTitulo(), contenido.getDuracion(), contenido.getGenero()))
                .toList();
    }

    public int duraciontotalconmap() {
        return contenido.stream().mapToInt(i -> i.getDuracion()).sum();
    }

    public List<Pelicula> getPopularesplatzi (){
        return contenido.stream().sorted(Comparator.comparingDouble(Pelicula::getCalificacion).reversed()).toList();
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