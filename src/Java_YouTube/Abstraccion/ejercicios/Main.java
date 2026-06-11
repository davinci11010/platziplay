package Java_YouTube.Abstraccion.ejercicios;

public class Main {
    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,2);
        rectangle.calculateArea();

        Circle circle = new Circle(10);
        circle.calculateArea();


    }
    public static abstract class Shape{
        public abstract void calculateArea();
    }



    public static class Rectangle extends Shape{
        private int base;
        private int altura;

        public Rectangle (int base, int altura){
            this.base = base;
            this.altura = altura;
        }

        @Override
        public void calculateArea() {
            System.out.println("Rectangulo (b: " + getBase() +", "+ "h: "+ getAltura() + " )" );
            System.out.println("--> " + base * altura + "m²");

        }
         public int getBase (){
            return base;
         }
         public int getAltura(){
            return altura;
         }

    }


    public static class Circle extends Shape{
        private int r;
        private double pi;

        public Circle (int r){
            this.r = r;
            this.pi = 3.1416;

        }
        @Override
        public void calculateArea() {
            System.out.println("Circulo (r: " + getR() + ")" );
            double area_ciruclo = pi * (r*r);
            System.out.println("-->: " + area_ciruclo + "m²");

        }
        public int getR() {
            return r;
        }

        public double getPi() {
            return pi;
        }
    }


}