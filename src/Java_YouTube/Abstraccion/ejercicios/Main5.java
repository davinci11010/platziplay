package Java_YouTube.Abstraccion.ejercicios;

public class Main5 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(10);



    }

    public static abstract class Employee{
        public abstract void calculateSalary();
    }


    public static class FullTimeEmployee extends Employee{
        private int hours;
        public FullTimeEmployee (int hours){
            this.validate_hours(hours);

        }
        @Override
        public void calculateSalary() {
            System.out.println("hora a: 10.000 COP");
            System.out.println("Pago -->: " + hours * 10000);

        }

        private void validate_hours (int hours) {
            if (hours >= 1 && hours <= 10){
                this.hours = hours;
            } else {
                this.hours =0;
            }

        }
    }
}