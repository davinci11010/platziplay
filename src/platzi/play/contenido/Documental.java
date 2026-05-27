package platzi.play.contenido;

import java.time.LocalDate;

public class Documental extends Pelicula{
    private String narrador;
    public Documental(
            String titulo,
            String descripcion,
            int duracion,
            Genero genero,
            LocalDate fecha_estreno,
            double calificacion,
            boolean disponible) {
        super(titulo, descripcion, duracion, genero, fecha_estreno, calificacion, disponible);
        this.narrador = narrador;

    }
    public String getNarrador(){
        return narrador;
    }


}


