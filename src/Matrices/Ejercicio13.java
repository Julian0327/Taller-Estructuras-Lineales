package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    private static int[][] matriz;
    private static int n;

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        pedirTamano(sc);
        generarMatriz();
        mostrarMatriz();
        matrizSimetrica();
        imprimirEsquinas();
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
                matriz[i][j] = rnd.nextInt(100);
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

    private static boolean esMatrizSimetrica() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void matrizSimetrica() {
        if (esMatrizSimetrica()) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }
    }

    private static void imprimirEsquinas() {
        System.out.println("\nEsquinas de la matriz:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
    }
}