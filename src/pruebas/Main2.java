package pruebas;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Persona persona = new Persona(
                "David",
                "Pulgarin",
                "Colombiano",
                23);

        Persona persona1 = new Persona(
                "Kevin",
                "Soto",
                "Colombiano",
                23);

        //System.out.println(persona.mostrar_informacion());


        ArrayList<Persona> lista_personas = new ArrayList<>();
        lista_personas.add(persona);
        lista_personas.add(persona1);
        System.out.println(lista_personas);
        for (int i = 0 ; i < lista_personas.size() ; i ++) {
            System.out.println(lista_personas.get(i).getNombre());
        }
    }



}
