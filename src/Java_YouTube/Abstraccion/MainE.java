package Java_YouTube.Abstraccion;

public class MainE {
    public static void main(String[] args) {
        Perro perro =  new Perro("Firulais");
        perro.Comer();

        Pajaro pajaro = new Pajaro("mordecai");
        pajaro.volar();
        pajaro.Dormir();

    }
    public static abstract class Animal{
        private String nombre_animal;
        public Animal (String nombre_animal){
            this.nombre_animal = nombre_animal;
        }

        public abstract void Comer();

        public void Dormir(){
            System.out.println("El animal esta durmiendo");

        }

        public String getNombre_animal(){
            return nombre_animal;
        }

    }

    public interface Volando{
        void volar();

    }

    public static class Pajaro extends Animal implements Volando{
        public Pajaro (String nombre_animal){
            super(nombre_animal);
        }

        @Override
        public void Comer() {

        }

        @Override
        public void Dormir() {
            System.out.println("El pajaro de nombre: " + super.getNombre_animal().toUpperCase() + " esta durmiendo..");
        }

        @Override
        public void volar() {
            System.out.println("EL PAJARO DE NOMBRE: " + super.getNombre_animal() + " ESTA VOLANDO");

        }
    }






    public static class Perro extends Animal{

        public Perro(String nombre_animal) {
            super(nombre_animal);
        }

        @Override
        public void Comer() {
            System.out.println("-- EL PERRO ( " + super.getNombre_animal().toUpperCase() + " ) ESTA COMIENDO--");
        }
    }


}