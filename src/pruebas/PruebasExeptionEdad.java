package pruebas;

public class PruebasExeptionEdad extends RuntimeException {
    public PruebasExeptionEdad(String nombre)
    {
        super(nombre.toUpperCase() + " su edad no es valida".toUpperCase());
    }
}
