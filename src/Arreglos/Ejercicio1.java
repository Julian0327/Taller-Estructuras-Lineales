package Arreglos;

public class Ejercicio1 {
    public static void ejecutar() {
        int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        imprimir(primos);
    }

    public static void imprimir(int[] primos) {
        System.out.println("Primeros 10 números primos:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + ", ");
        }
    }

}
