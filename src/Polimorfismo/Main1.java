package Polimorfismo;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makesound();
        cat.makesound();
        cow.makesound();
    }
    public static class Animal {
        public void makesound() {
            System.out.println("El animal esta haciendo un sonido");

        }
    }
    public static class Dog extends Animal {
        @Override
        public void makesound() {
            System.out.println("El perro hace guau");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makesound() {
            System.out.println("El gato hace miau");
        }
    }
    public static class Cow extends Animal {
        @Override
        public void makesound() {
            System.out.println("La vaca hace muuuu");
        }
    }
}
