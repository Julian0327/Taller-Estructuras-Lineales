package Matrices;

public class Ejercicio14 {
    private static int[][] matriz = {
            { 1, 12, 3 },
            { 4, 45, 6 },
    };

    public static void ejecutar() {
        System.out.println("Matriz original:");
        imprimirMatriz();
        System.out.println("Matriz Transpuesta");
        imprimirMatrizTranspuesta();
    }

    private static void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void imprimirMatrizTranspuesta() {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
