package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    private static int[][] matriz;
    private static int m;
    private static int n;

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el número de filas (m): ");
        m = sc.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        n = sc.nextInt();

        generarMatriz();

        System.out.println("\nMatriz original:");
        imprimir();

        intercambiarFilas();

        System.out.println("\nMatriz con filas intercambiadas:");
        imprimir();
    }

    public static void generarMatriz() {
        matriz = new int[m][n];
        Random rnd = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rnd.nextInt(100);
            }
        }
    }

    public static void intercambiarFilas() {
        if (m >= 2) {
            int[] temp = matriz[0];
            matriz[0] = matriz[1];
            matriz[1] = temp;
        } else {
            System.out.println("\nNo hay suficientes filas para intercambiar.");
        }
    }

    public static void imprimir() {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}