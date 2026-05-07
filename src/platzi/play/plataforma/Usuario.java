
//Usuario
package platzi.play.plataforma;

import com.sun.security.auth.UnixNumericUserPrincipal;
import platzi.play.contenido.Pelicula;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String email;
    private LocalDate fecha_registro;


    public Usuario (String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        this.fecha_registro = LocalDate.now();
    }

    public void ver (Pelicula pelicula){
        System.out.println(nombre + " esta viendo... " + pelicula.getTitulo());
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    //SETTERS

    public void setEmail(String nuevoemail){
        this.email = nuevoemail;

    }




}