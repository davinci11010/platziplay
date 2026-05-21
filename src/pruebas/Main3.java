package pruebas;

public class Main3 {
    public static void main(String[] args) {
        Persona persona = new Persona(
                "David",
                "Pulgarin",
                "Colombiano",
                Ciudades.MEDELLIN,
                23
                );
        Contenedor contenedor = new Contenedor("Universidad de Medellin");
        contenedor.agregar_personas(persona);
        for (int i = 0; i < contenedor.getContenedorPersonas().size(); i++){
            System.out.println(contenedor.getContenedorPersonas().get(i).getNombre());
        }

    }
}