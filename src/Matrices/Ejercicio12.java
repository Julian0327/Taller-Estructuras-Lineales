package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

    private static int[][] matriz;
    private static int n;

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        pedirTamano(sc);
        generarMatriz();
        mostrarMatriz();

        int suma = calcularSumaDiagonalOpuesta();
        System.out.println("\nLa suma de la diagonal opuesta a la principal es: " + suma);
    }

    private static void pedirTamano(Scanner sc) {
        System.out.print("Ingrese el tamano de la matriz (n): ");
        n = sc.nextInt();
    }

    private static void generarMatriz() {
        matriz = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rnd.nextInt(101) - 50;
            }
        }
    }

    private static void mostrarMatriz() {
        System.out.println("\nMatriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static int calcularSumaDiagonalOpuesta() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }
}
