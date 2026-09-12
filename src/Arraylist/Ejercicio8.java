package Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8 {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 8: Frecuencia de Números Aleatorios ---");

        ArrayList<Integer> numeros = generarAleatorios(100, 1, 20);

        System.out.println("\nNúmeros generados (100 elementos):");
        imprimirEnFilas(numeros, 20);

        int[] frecuencias = calcularFrecuencias(numeros, 20);

        mostrarTablaFrecuencias(frecuencias, 1, 20);

        mostrarMayorFrecuencia(frecuencias, 1, 20);
    }

    public static ArrayList<Integer> generarAleatorios(int cantidad, int min, int max) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int num = random.nextInt(max - min + 1) + min;
            lista.add(num);
        }
        return lista;
    }

    public static int[] calcularFrecuencias(ArrayList<Integer> numeros, int maxValor) {
        int[] frecuencias = new int[maxValor + 1];
        for (int num : numeros) {
            frecuencias[num]++;
        }
        return frecuencias;
    }

    public static void mostrarTablaFrecuencias(int[] frecuencias, int min, int max) {
        System.out.println("\n+--------+------------+");
        System.out.println("| Número | Frecuencia |");
        System.out.println("+--------+------------+");
        for (int i = min; i <= max; i++) {
            System.out.printf("|   %2d   |     %2d     |%n", i, frecuencias[i]);
        }
        System.out.println("+--------+------------+");
    }

    public static void mostrarMayorFrecuencia(int[] frecuencias, int min, int max) {
        int maxFrecuencia = 0;

        for (int i = min; i <= max; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
            }
        }

        System.out.println("\n--- Número(s) con Mayor Frecuencia ---");
        System.out.println("Frecuencia máxima: " + maxFrecuencia + " veces");
        System.out.print("Número(s): ");
        for (int i = min; i <= max; i++) {
            if (frecuencias[i] == maxFrecuencia) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void imprimirEnFilas(ArrayList<Integer> lista, int porFila) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%2d ", lista.get(i));
            if ((i + 1) % porFila == 0) {
                System.out.println();
            }
        }
    }
}
