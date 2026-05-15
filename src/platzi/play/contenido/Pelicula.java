// PELICULA 
package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private int duracion;
    private Genero genero;
    private LocalDate fecha_estreno;
    private double calificacion;
    private boolean disponible;


    public Pelicula (String titulo, String descripcion, int duracion, Genero genero, LocalDate fecha_estreno, double calificacion, boolean disponible){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero = genero;
        this.fecha_estreno = fecha_estreno;
        this.calificar(calificacion);
        this.disponible = disponible;
    }

    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo);
    }

    public String obtenerFichaTecnica() {
        System.out.println("------------------------");
        return titulo +  " (" + fecha_estreno.getYear() + ")" + "\n" +
                "Genero: " + genero + "\n" +
                "Calificacion: " + calificacion + " /5" + "\n";
    }

    public void calificar (double calificacion){
        if (calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        } else {
            this.calificacion = 0.0;
        }
    }

    public boolean esPopular() {
        if (calificacion >= 4) {
            return true;
        } else {
            return false;
        }

    }
    //GETTERS
    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public LocalDate getFecha_estreno() {
        return fecha_estreno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    //SETTER


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFecha_estreno(LocalDate fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}