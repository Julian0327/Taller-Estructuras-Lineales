package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(Scanner sc) {

        System.out.print("Ingrese la cantidad de números (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }

        int[] numeros = generarAleatorios(n, 0, 12);

        long[] factoriales = calcularFactoriales(numeros);

        imprimirResultados(numeros, factoriales);
    }

    public static int[] generarAleatorios(int n, int min, int max) {
        Random random = new Random();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt((max - min) + 1) + min;
        }
        return arreglo;
    }

    public static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
        return factoriales;
    }

    public static long factorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void imprimirResultados(int[] numeros, long[] factoriales) {
        System.out.println("\n--- Arreglo de números iniciales ---");
        imprimirArreglo(numeros);

        System.out.println("\n--- Arreglo de factoriales ---");
        imprimirArreglo(factoriales);

        System.out.println("\n--- Relación número -> factorial ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "! = " + factoriales[i]);
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void imprimirArreglo(long[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
