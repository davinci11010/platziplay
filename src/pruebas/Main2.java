package pruebas;

import com.sun.security.jgss.GSSUtil;
import platzi.play.contenido.Genero;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("UNIVERSIDAD DE MEDELLIN");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numero_ingresado  =  scanner.nextLine();
        try {
            int nuevonumero = Integer.parseInt(numero_ingresado);
            System.out.println("TODO ESTA OK");
            System.out.println("NUMERO TIPO ENTERO: " + nuevonumero);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR --> EL DATO NO ES VALIDO EN EL SISTEMA");
        }

    }

}
