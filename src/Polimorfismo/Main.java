package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // POLIMORFISMO POR HERENCIA CON SOBREESCRITURA
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        //POLIMORFISMO POR SOBRECARGA DE METODOS

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(4.1, 5.0));



    }
    public static class Animal{
        public void sound(){
            System.out.println("Algun sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }


    public static class Calculator {
        public int sum (int a, int b){
            return a + b;
        }

        public double sum (double a, double b){
            return a + b;
        }
    }



}
