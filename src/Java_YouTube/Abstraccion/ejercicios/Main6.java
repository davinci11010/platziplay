package Java_YouTube.Abstraccion.ejercicios;

public class Main6 {
    public static void main(String[] args) {
        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        Car car = new Car();
        car.move();

        Robot robot = new Robot();
        robot.move();
    }

    public interface Movable{
        public void move();
    }

    public static class Car implements Movable{
        @Override
        public void move() {
            System.out.println("El carro se esta moviendo");
        }
    }
    public static class Robot implements Movable{
        @Override
        public void move() {
            System.out.println("El robot se esta moviendo");
        }
    }

}
