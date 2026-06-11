package Java_YouTube.Abstraccion.ejercicios;

public class Main4 {
    public static void main(String[] args) {
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().


        Circle circle = new Circle();
        circle.Draw();

        Square square = new Square();
        square.Draw();

        Triangle triangle = new Triangle();
        triangle.Draw();



    }
    public interface Drawable {
        public void Draw();
    }


    public static class Circle implements Drawable{
        @Override
        public void Draw() {
            System.out.println("el circulo se esta dibujando");
        }
    }
    public static class Square implements Drawable{
        @Override
        public void Draw() {
            System.out.println("el cuadrado se esta dibujando");
        }
    }
    public static class Triangle implements Drawable{
        @Override
        public void Draw() {
            System.out.println("el triangulo se esta dibujando");
        }
    }


}