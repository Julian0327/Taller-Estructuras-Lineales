package Arreglos;

import java.util.Random;

public class Ejercicio4 {
    public static void ejecutar() {
        int numeros[] = generarAleatorios(25, -50, 50);
        imprimirEnUnaLinea(numeros);
        mayorMenor(numeros);

    }

    public static int[] generarAleatorios(int n, int min, int max) {
        Random aleatorio = new Random();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = aleatorio.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }

    public static void mayorMenor(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }

    public static void imprimirEnUnaLinea(int[] numeros) {
        System.out.println("Los números son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
