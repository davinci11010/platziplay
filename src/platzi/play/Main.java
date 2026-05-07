//MAIN
package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static final String VERSION = "1.0.0";

    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_TITULO = 3;
    public static final int ELIMINAR = 4;
    public static final int SALIR = 5;
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("NETFLIX");

        while (true) {
            System.out.println(
                    "1 ) Agregar contenido" + "\n" +
                            "2) Mostrar todo " + "\n" +
                            "3) Buscar por titulo" + "\n" +
                            "4) Eliminar" + " \n" +
                            "5) Salir" + "\n");
            int opcion = ScannerUtils.capturarnumero("Ingresa la opcion");
            System.out.println("Opcion elegida: " + opcion);


            switch (opcion) {
                case AGREGAR -> {
                    String titulo = ScannerUtils.capturartexto("Cual es el nombre del contenido");
                    String genero = ScannerUtils.capturartexto("Cual es el genero");
                    int duracion = ScannerUtils.capturarnumero("Cual es la duracion del contenido");
                    double calificacion = ScannerUtils.capturardecimal("Cual es la calificacion del contenido");
                    boolean disponible = true;
                    String descipcion = "Aqui va la descripcion de la pelicula";

                    Pelicula pelicula = new Pelicula(
                            titulo,
                            descipcion,
                            200,
                            genero,
                            LocalDate.of(2018, 10, 15),
                            calificacion,
                            disponible);
                    plataforma.agregar(pelicula);

                }
                case MOSTRAR_TODO -> {
                    plataforma.mostrartitulos();

                }
                case BUSCAR_TITULO -> {
                    //falta
                }
                case ELIMINAR -> {
                    //falta
                }
                case SALIR -> {
                    System.exit(0);

                }
            }
        }




        //usuario.ver(pelicula);



    }
}