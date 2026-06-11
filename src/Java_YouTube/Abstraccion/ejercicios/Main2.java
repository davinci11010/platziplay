package Java_YouTube.Abstraccion.ejercicios;

public class Main2 {
    public static void main(String[] args) {
        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

    }

    public interface Playable {
        public void play();
    }


    public static class Guitar implements Playable{
        @Override
        public void play() {
            System.out.println("--ESTA SONANDO LA GUITARRA--");
        }
    }

    public static class Piano implements Playable{
        @Override
        public void play() {
            System.out.println("--ESTA SONANDO EL PIANO--");
        }
    }
}
