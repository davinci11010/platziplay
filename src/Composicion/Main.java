package Composicion;

public class Main {

    // COMPOSICION EN JAVA
    public static void main(String[] args) {
        Car car = new Car();
        car.motor.On();

    }

    public static class Motor {
        public void On(){
            System.out.println("El motor esta encendido");
        }
    }

    public static class Car {
        Motor motor = new Motor();
    }
}