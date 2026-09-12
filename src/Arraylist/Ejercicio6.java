package Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {

    public static void ejecutar() {
        ArrayList<Integer> numeros = generarNumerosHastaDiez();
        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros, suma);

        mostrarResultados(numeros, suma, media);
    }

    public static ArrayList<Integer> generarNumerosHastaDiez() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();
        int numero;

        do {
            numero = aleatorio.nextInt(21) - 10;
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static double calcularMedia(ArrayList<Integer> numeros, int suma) {
        if (numeros.isEmpty()) {
            return 0.0;
        }
        return (double) suma / numeros.size();
    }

    public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double media) {
        System.out.println("--- Ejercicio 6: Números Aleatorios entre -10 y 10 ---");
        System.out.println("Total de números generados: " + numeros.size());
        System.out.println("Números leídos: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f%n", media);
    }
}
