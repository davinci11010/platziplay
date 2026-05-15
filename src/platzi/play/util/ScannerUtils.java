
//Scannerutils
package platzi.play.util;


import org.w3c.dom.stylesheets.StyleSheetList;
import platzi.play.contenido.Genero;

import java.util.Scanner;

public class ScannerUtils {
    public static final Scanner SCANNER =  new Scanner(System.in);
    public static String capturartexto (String mensaje) {
        System.out.println(mensaje + ": ");
        return SCANNER.nextLine();

    }
    public static int capturarnumero (String mensaje) {
        System.out.println(mensaje + ": ");
        while (!SCANNER.hasNextInt()){
            System.out.println("Dato no aceptado. " + mensaje + ": ");
            SCANNER.next();
        }

        int dato = SCANNER.nextInt();
        SCANNER.nextLine();
        return dato;
    }

    public static double capturardecimal (String mensaje) {
        System.out.println(mensaje + ": ");
        while (!SCANNER.hasNextDouble()){
            System.out.println("Dato no aceptado. " + mensaje + ": ");
            SCANNER.next();
        }

        double dato = SCANNER.nextDouble();
        SCANNER.nextLine();
        return dato;
    }

    public static Genero capturar_genero (String mensaje){
        while (true) {
            System.out.println(mensaje + " Opciones: ");
            for (Genero genero : Genero.values()){
                System.out.println("-" + genero.name() + "-");
            }
            System.out.println("Cual quieres?");
            String entrada = SCANNER.nextLine();
            try {
                return Genero.valueOf(entrada.toUpperCase());
            } catch (IllegalArgumentException e){
                System.out.println("Genero no aceptado");
            }
        }
    }



}