package pruebas;

public class PruebasExeption extends RuntimeException {
    public PruebasExeption() {
        super("ERROR --> EL DATO NO ES VALIDO EN EL SISTEMA");
    }
}
