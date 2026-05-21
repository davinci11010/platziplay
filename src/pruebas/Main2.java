package pruebas;

import com.sun.security.jgss.GSSUtil;
import platzi.play.contenido.Genero;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);


        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                System.out.println(numeros.get(i) + "--> Numero par");
            }
        }

        System.out.println("------");
        var n = numeros.stream().filter( integer -> integer % 2 == 0).toList();
        int suma = n.stream().mapToInt( i -> i).sum();
        System.out.println(n);
        System.out.println(suma);


    }}
