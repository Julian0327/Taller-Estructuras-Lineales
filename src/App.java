import Arreglos.*;
import Arraylist.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 3 -> Ejercicio3.ejecutar(sc);
                case 4 -> Ejercicio4.ejecutar();
                case 5 -> Ejercicio5.ejecutar();
                case 6 -> Ejercicio6.ejecutar();
                case 7 -> Ejercicio7.ejecutar(sc);
                case 8 -> Ejercicio8.ejecutar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Taller Estructuras Lineales ---");
        System.out.println("1-5   Ejercicios de arreglos");
        System.out.println("6-10  Ejercicios de ArrayList");
        System.out.println("11-15 Ejercicios de matrices");
        System.out.println("0     Salir");
        System.out.print("Elige un ejercicio: ");
    }
}
