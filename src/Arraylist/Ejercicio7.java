package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void ejecutar(Scanner sc) {
        ArrayList<Integer> numeros = generarPares(20);

        System.out.println("Lista inicial ordenada:");
        imprimir(numeros);

        System.out.print("\nIngrese un número cualquiera para insertar: ");
        int numero = sc.nextInt();

        int posicion = insertarEnOrden(numeros, numero);

        System.out.println("\nEl número " + numero + " fue insertado en el índice: "
                + posicion);
        System.out.println("Lista actualizada tras inserción:");
        imprimir(numeros);

        eliminar(numeros, sc);
    }

    public static ArrayList<Integer> generarPares(int cantidad) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            pares.add(i * 2);
        }
        return pares;
    }

    public static int insertarEnOrden(ArrayList<Integer> lista, int numero) {
        int indice = lista.size();
        for (int i = 0; i < lista.size(); i++) {
            if (numero <= lista.get(i)) {
                indice = i;
                break;
            }
        }
        lista.add(indice, numero);
        return indice;
    }

    public static void imprimir(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
    }

    public static void eliminar(ArrayList<Integer> numeros, Scanner sc) {
        System.out.print("\n¿Qué número quieres eliminar?: ");
        int numero = sc.nextInt();

        // Integer.valueOf(numero) asegura que se elimine por valor y no por índice
        boolean eliminado = numeros.remove(Integer.valueOf(numero));

        if (eliminado) {
            System.out.println("El número " + numero + " fue eliminado exitosamente.");
        } else {
            System.out.println("El número " + numero + " no existe en la lista.");
        }

        System.out.println("Lista final:");
        imprimir(numeros);
    }
}
