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
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("NETFLIX");

        System.out.println("PLATZI PLAY 🍿 v" + VERSION);
        Scanner scanner = new Scanner(System.in);
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
                LocalDate.of(2018,10,15),
                calificacion,
                disponible);

        Pelicula pelicula1 = new Pelicula("El hombre araña",
                "Es una pelicula de accion",
                220,
                "Accion",
                LocalDate.now(),
                4.7,
                true);

        System.out.println(pelicula1.obtenerFichaTecnica());
        System.out.println(pelicula.obtenerFichaTecnica());



        plataforma.agregar(pelicula);
        plataforma.agregar(pelicula1);
        System.out.println("Numero de elementos en la plataforma: " + plataforma.getcontenido().size());

        plataforma.mostrartitulos();
        System.out.println("-------------------");
        plataforma.eliminar(pelicula);
        plataforma.mostrartitulos();



        Usuario usuario = new Usuario(
                "David",
                "dpulgarin437@gmail.com");


        //usuario.ver(pelicula);



    }
}