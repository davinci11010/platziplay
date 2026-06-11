package Java_YouTube.Abstraccion;

public class Main {
    public static void main(String[] args) {
        //Abstraccion

        // SI UNA CLASE SE CONSIDERA ABSTRACTA SOLO CUANDO EN LA CLASE PADRE DEL FUNCIONAMIENTO DE OTRAS QUE HERENDEN DE LA MISMA POR ESO NO SE PUEDE INSTANCIAR


        //Clase abstracta

        Dog dog = new Dog("Pinina");
        dog.sleep();
        dog.sound();

        //Abstraccion - Interface
        Bat bat = new Bat("pajarito");
        bat.fly();

    }
    public static abstract class Animal {
        //ATRIBUTOS
        private String nombre;
        // CONSTRUCTOR
        public Animal (String nombre){
            this.nombre = nombre;
        }
        // METODOS
        public abstract void sound();
        public abstract void sleep();
        // GETTERS and SETTERS
        public String getNombre(){
            return nombre;
        }

    }

    public static class Dog extends Animal{
        public Dog (String nombre) {
            super(nombre);
        }
        @Override
        public void sound() {
            System.out.println("El perro de nombre (" + super.getNombre() + ") hace Guau!...");

        }
        @Override
        public void sleep() {
            System.out.println("El perro de nombre (" + super.getNombre() + ") esta durmiendo!...");

        }
    }
    public interface Flying {
        void fly();

    }
    public static class Bat extends Animal implements Flying{

        public Bat (String nombre) {
            super(nombre);
        }

        @Override
        public void fly() {
            System.out.println("El murcielago de nombre (" + super.getNombre().toUpperCase() +  ") esta volando...");
        }

        @Override
        public void sleep() {

        }

        @Override
        public void sound() {
            System.out.println("Soy batman!");

        }
    }






}
