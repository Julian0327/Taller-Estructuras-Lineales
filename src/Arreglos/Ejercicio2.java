package Arreglos;

public class Ejercicio2 {
    public static void ejecutar() {
        int[] pares = generarPares(100);

        imprimirEnUnaLinea(pares);
        System.out.println();
        imprimirEnDiezLineas(pares);
    }

    public static int[] generarPares(int cantidad) {
        int[] pares = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }

    // 1. Mostrar los números pares en una sola línea
    public static void imprimirEnUnaLinea(int[] pares) {
        System.out.println("Números pares en una sola línea:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
    }

    // 2. Mostrar los números pares en 10 líneas indicando el número de línea (10
    // por línea)
    public static void imprimirEnDiezLineas(int[] pares) {
        System.out.println("Números pares en 10 líneas:");
        int elementosPorLinea = 10;
        int totalLineas = 10;

        for (int linea = 1; linea <= totalLineas; linea++) {
            System.out.print("Línea " + linea + ": ");
            int inicio = (linea - 1) * elementosPorLinea;
            for (int j = 0; j < elementosPorLinea; j++) {
                System.out.print(pares[inicio + j] + " ");
            }
            System.out.println();
        }
    }
}
