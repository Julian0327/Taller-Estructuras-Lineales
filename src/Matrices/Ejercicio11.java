package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    private static int[][] matriz;
    private static int m;
    private static int n;

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        pedirDimensiones(sc);
        generarMatriz();
        mostrarMatriz();

        System.out.print("\nIngrese el numero a buscar: ");
        int numero = sc.nextInt();

        int[] posicion = buscarNumero(numero);
        mostrarResultado(numero, posicion);
    }

    private static void pedirDimensiones(Scanner sc) {
        System.out.print("Ingrese el numero de filas (m): ");
        m = sc.nextInt();
        System.out.print("Ingrese el numero de columnas (n): ");
        n = sc.nextInt();
    }

    private static void generarMatriz() {
        matriz = new int[m][n];
        Random rnd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rnd.nextInt(100);
            }
        }
    }

    private static void mostrarMatriz() {
        System.out.println("\nMatriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] buscarNumero(int numero) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == numero) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    private static void mostrarResultado(int numero, int[] posicion) {
        if (posicion[0] != -1) {
            System.out.println("El numero " + numero + " se encontro en la fila "
                    + posicion[0] + ", columna " + posicion[1] + ".");
        } else {
            System.out.println("El numero " + numero + " no se encuentra en la matriz.");
        }
    }
}