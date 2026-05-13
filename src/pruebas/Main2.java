package pruebas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String>contenedor_nombres = new ArrayList<>();
        contenedor_nombres.add("David");
        contenedor_nombres.add(("Sebastian"));
        contenedor_nombres.add("Kevin");

        for (String contenedorNombre : contenedor_nombres) {
            System.out.println(contenedorNombre);
        }

        ArrayList<String> nombresciudades = new ArrayList<>();
        nombresciudades.add("Medellin");
        nombresciudades.add("Bogota");

        System.out.println(nombresciudades);



    }



}
