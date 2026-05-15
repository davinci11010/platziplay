package pruebas;

import platzi.play.contenido.Genero;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ciudad de residencia: ");
        String ciudad_residencia = sc.nextLine();
        Ciudades ciudadenum = Ciudades.valueOf(ciudad_residencia);

        Persona persona = new Persona("David", "Pulgarin", "Colombiano", ciudadenum, 23);
        System.out.println(persona.mostrar_informacion());







    }



}
