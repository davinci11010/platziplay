package Java_YouTube.Abstraccion.Exepciones;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (Exception e){
            System.out.println("Error --> " + e.getMessage());

        }
    }
}
