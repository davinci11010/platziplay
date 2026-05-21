package pruebas;

public class Main3 {
    public static void main(String[] args) {
        Persona persona = new Persona(
                "David",
                "Pulgarin",
                "Colombiano",
                Ciudades.MEDELLIN,
                0
                );
        Contenedor contenedor = new Contenedor("Universidad de Medellin");
        contenedor.agregar_personas(persona);
        System.out.println(contenedor.getContenedorPersonas());

    }
}