package pruebas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main4 {
    public static void main(String[] args) throws IOException {
        try {

            List<String> lineas_dbpersonas = Files.readAllLines(Paths.get("dbpersonas"));
            String[] datos = null;
            for (int i = 0 ; i < lineas_dbpersonas.size(); i ++){
                datos = lineas_dbpersonas.get(i).split("\\|");
                if (datos.length == 4){
                    String nombre = datos[0];
                    String apellido = datos[1];
                    String nacionalidad = datos[2];
                    int edad = Integer.parseInt(datos[3]);

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido: " + apellido);
                    System.out.println("Nacionalidad: " + nacionalidad);
                    System.out.println("Edad: " + edad);
                }

            }

        } catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

    }
}