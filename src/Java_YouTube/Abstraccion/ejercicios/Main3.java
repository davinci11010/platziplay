package Java_YouTube.Abstraccion.ejercicios;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

        ArrayList<Animal> contenedor = new ArrayList<>();

        Dog dog = new Dog();
        Cat cat = new Cat();


        contenedor.add(dog);
        contenedor.add(cat);

        for (int i = 0 ;  i < contenedor.size() ; i++){
            System.out.println(contenedor.get(i).makeSound());
        }

    }
    public static abstract class Animal{
        public abstract String makeSound();
    }
    public static class Dog extends Animal{
        @Override
        public String makeSound() {
            return "El perro hace Guau!";
        }
    }
    public static class Cat extends Animal{
        @Override
        public String makeSound() {
            return "El gato hace Miau!";
        }
    }


}