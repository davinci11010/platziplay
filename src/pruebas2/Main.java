package pruebas2;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Manolo");
        System.out.println(gato.comer());

        Perro perro = new Perro("Firulais");
        System.out.println(perro.comer());
    }
}
