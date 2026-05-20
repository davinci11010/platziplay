//MAIN
package platzi.play;

import platzi.play.contenido.Genero;
import platzi.play.contenido.Pelicula;
import platzi.play.exepcion.PeliculaExistenteException;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static final String nombre_plataforma = "NETLIX";
    public static final String VERSION = "1.0.0";

    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_TITULO = 3;
    public static final int BUSCAR_GENERO = 4;
    public static final int VER_POPULARES = 5;
    public static final int VER_PELICULA_MAYOR_DURACION = 6;
    public static final int VER_PELICULA_MENOR_DURACION = 7;
    public static final int ELIMINAR = 8;
    public static final int SALIR = 9;

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(nombre_plataforma);

        Usuario usuario =  new Usuario("David", "dpulgarin437@gmail.com");
        System.out.println(nombre_plataforma + "🍿 v" + VERSION);

        Pelicula pelicula1 = new Pelicula("Harry potter", "es de magia", 200, Genero.FANTASIA,LocalDate.now(), 4.5, true);
        Pelicula pelicula2 = new Pelicula("Hombre Araña", "es de accion", 220, Genero.ACCION,LocalDate.now(), 5, true);
        Pelicula pelicula3 = new Pelicula("titanic", "es de amor", 300, Genero.DRAMA,LocalDate.now(), 4, true);
        Pelicula pelicula4 = new Pelicula("Avengers", "es de accion", 330, Genero.ACCION,LocalDate.now(), 5, true);
        plataforma.agregar(pelicula1);
        plataforma.agregar(pelicula2);
        plataforma.agregar(pelicula3);
        plataforma.agregar(pelicula4);

        //plataforma.getpopulares();
        //System.out.println(plataforma.getduraciontotal());
        System.out.println("Mas de " + plataforma.getduracionplatzi() + " Minutos de contenido!");

        while (true) {
            System.out.println(
                    "1) Agregar contenido" + "\n" +
                            "2) Mostrar todo " + "\n" +
                            "3) Buscar por titulo" + "\n" +
                            "4) Buscar por genero" + "\n" +
                            "5) Ver Populares" + "\n" +
                            "6) Ver Pelicula con mayor duracion" + "\n" +
                            "7) Ver Pelicula con menor duracion" + "\n" +
                            "8) Eliminar" + " \n" +
                            "9) Salir" + "\n");
            int opcion = ScannerUtils.capturarnumero("Ingresa la opcion");
            System.out.println("Opcion elegida: " + opcion);


            switch (opcion) {
                case AGREGAR -> {
                    String titulo = ScannerUtils.capturartexto("Cual es el nombre del contenido");
                    Genero genero = ScannerUtils.capturar_genero("Genero del contenido");
                    int duracion = ScannerUtils.capturarnumero("Cual es la duracion del contenido");
                    double calificacion = ScannerUtils.capturardecimal("Cual es la calificacion del contenido");
                    boolean disponible = true;
                    String descipcion = "Aqui va la descripcion de la pelicula";

                    try {
                        Pelicula pelicula = new Pelicula(
                            titulo,
                            descipcion,
                            200,
                            genero,
                            LocalDate.of(2018, 10, 15),
                            calificacion,
                            disponible);
                        plataforma.agregar(pelicula);

                    } catch (PeliculaExistenteException e) {
                        System.out.println("\n" + e.getMessage().toUpperCase() + "\n");
                    }

                }
                case MOSTRAR_TODO -> {
                    plataforma.mostrartitulos();

                }
                case BUSCAR_TITULO -> {
                    String titulo_ingresado =  ScannerUtils.capturartexto("Ingrese el titulo que quiere buscar");
                    if(plataforma.buscarpeliculamejorado(titulo_ingresado) == null){
                        System.out.println("❌❌LA PELICULA NO SE ENCUENTRA EN LA BASE DE DATOS❌❌");
                    } else {
                        System.out.println(plataforma.buscarpeliculamejorado(titulo_ingresado));
                    }
                }
                case BUSCAR_GENERO -> {
                    Genero generobuscar = ScannerUtils.capturar_genero("Ingrese el genero que quiere buscar");
                    System.out.println("Se encontraron " + plataforma.buscarporgenero(generobuscar).size() + " generos de " + generobuscar);
                    for (int i = 0 ; i < plataforma.buscarporgenero(generobuscar).size() ; i ++){
                        System.out.println(plataforma.buscarporgenero(generobuscar).get(i).obtenerFichaTecnica());
                    }
                }
                case VER_POPULARES -> {
                    ArrayList<Pelicula> mejores = (ArrayList<Pelicula>) plataforma.getpopulares();
                    for (int i = 0 ; i < mejores.size(); i ++) {
                        System.out.println(mejores.get(i).obtenerFichaTecnica());
                    }
                    
                    //List<Pelicula> contenidoPopulares = plataforma.getPopularesplatzi();
                    //contenidoPopulares.forEach(pelicula -> System.out.println(pelicula.obtenerFichaTecnica()));
                }
                case VER_PELICULA_MAYOR_DURACION -> {
                    System.out.println(plataforma.get_pelicula_mas_larga());
                }
                case VER_PELICULA_MENOR_DURACION -> {
                    System.out.println(plataforma.get_pelicula_mas_corta());
                }
                case ELIMINAR -> {
                    String titulo_ingresado_eliminar = ScannerUtils.capturartexto("Ingrese el nombre de la pelicula que va a eliminar");
                    plataforma.eliminarpelicula(titulo_ingresado_eliminar);
                }
                case SALIR -> {
                    System.exit(0);

                }


            }
        }




        //usuario.ver(pelicula);



    }
}