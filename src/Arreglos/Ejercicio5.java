package Arreglos;

import java.util.Random;

public class Ejercicio5 {

    public static void ejecutar() {

        int[] numeros = generarAleatorios(20, 10, 999);


        int[] invertidos = invertirArreglo(numeros);

        System.out.println("Arreglo original:");
        imprimir(numeros);

        System.out.println("Arreglo con cada número invertido:");
        imprimir(invertidos);
    }

    public static int[] generarAleatorios(int n, int min, int max) {
        Random aleatorio = new Random();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = aleatorio.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }

    public static int[] invertirArreglo(int[] arreglo) {
        int[] invertidos = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertidos[i] = invertirNumero(arreglo[i]);
        }
        return invertidos;
    }

    public static int invertirNumero(int num) {
        int signo = num < 0 ? -1 : 1;
        num = Math.abs(num);
        int invertido = 0;
        while (num > 0) {
            invertido = (invertido * 10) + (num % 10);
            num /= 10;
        }
        return invertido * signo;
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
