package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9 {

    public static void ejecutar() {

        ArrayList<Integer> numeros = generarAleatorios(20, 1, 100);
        System.out.println("\n1. Lista Original (20 números entre 1 y 100):");
        System.out.println(numeros);

        ArrayList<Integer> menorAMayor = new ArrayList<>(numeros);
        Collections.sort(menorAMayor);
        System.out.println("\n2. Lista ordenada de menor a mayor (ascendente):");
        System.out.println(menorAMayor);

        ArrayList<Integer> mayorAMenor = new ArrayList<>(numeros);
        Collections.sort(mayorAMenor, Collections.reverseOrder());
        System.out.println("\n3. Lista ordenada de mayor a menor (descendente):");
        System.out.println(mayorAMenor);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        separarParesEImpares(numeros, pares, impares);

        System.out.println("\n4. Lista de números pares (" + pares.size() + " elementos):");
        System.out.println(pares);

        System.out.println("\n5. Lista de números impares (" + impares.size() + " elementos):");
        System.out.println(impares);
    }

    public static ArrayList<Integer> generarAleatorios(int cantidad, int min, int max) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int num = random.nextInt(max - min + 1) + min;
            lista.add(num);
        }
        return lista;
    }

    public static void separarParesEImpares(ArrayList<Integer> origen, ArrayList<Integer> pares,
            ArrayList<Integer> impares) {
        for (int num : origen) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
    }

}
