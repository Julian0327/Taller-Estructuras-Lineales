package Arraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    private static final String NOMBREFICHERO = "C:\\Users\\Julian\\OneDrive\\Escritorio\\TrabajosProgamacion\\Estructura-de-Datos-Lineales\\TallerEstructurasLineales\\src\\Arraylist\\PartidoLiga.txt";

    public static void ejecutar() {
        System.out.println("crear el arraylist como manejador del txt");
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(NOMBREFICHERO);
        Scanner leer;

        try {
            System.out.println("... leer el documento");
            leer = new Scanner(fichero);
            while (leer.hasNext()) {
                String linea = leer.nextLine();
                String[] cortarString = linea.split("::");
                PartidoFutbol partido = new PartidoFutbol();
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGalLocal(Integer.parseInt(cortarString[2]));
                partido.setGolVisitante(Integer.parseInt(cortarString[3]));
                partidos.add(partido);

            }
        } catch (Exception e) {
            System.out.println("El fichero no se puede leer");
        }
        System.out.println(partidos.size());

        mostrarPartidosGanadosPorElVisitante(partidos);
        contarYMostrarVictoriasDelBarcelona(partidos);
        contarYMostrarPartidosGanadosPorElLocal(partidos);
        eliminarPartidosSinEmpateYMostrarRestantes(partidos);

    }

    private static void mostrarPartidosGanadosPorElVisitante(ArrayList<PartidoFutbol> partidos) {
        System.out.println("\nPartidos ganados por el visitante:");
        int contador = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGolVisitante() > partido.getGalLocal()) {
                System.out.println(partido.getEquipoLocal() + " " + partido.getGalLocal()
                        + " - " + partido.getGolVisitante() + " " + partido.getEquipoVisitante());
                contador++;
            }
        }
        System.out.println("Total de partidos ganados por el visitante: " + contador);
    }

    private static void contarYMostrarVictoriasDelBarcelona(ArrayList<PartidoFutbol> partidos) {
        int victorias = 0;
        for (PartidoFutbol partido : partidos) {
            boolean ganoComoLocal = partido.getEquipoLocal().equalsIgnoreCase("Barcelona")
                    && partido.getGalLocal() > partido.getGolVisitante();
            boolean ganoComoVisitante = partido.getEquipoVisitante().equalsIgnoreCase("Barcelona")
                    && partido.getGolVisitante() > partido.getGalLocal();

            if (ganoComoLocal || ganoComoVisitante) {
                victorias++;
            }
        }
        System.out.println("\nVeces que ganó el Barcelona: " + victorias);
    }

    private static void eliminarPartidosSinEmpateYMostrarRestantes(ArrayList<PartidoFutbol> partidos) {
        partidos.removeIf(partido -> partido.getGalLocal() != partido.getGolVisitante());

        System.out.println("\nPartidos que terminaron en empate:");
        int contadorEmpates = 0;
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal() + " " + partido.getGalLocal()
                    + " - " + partido.getGolVisitante() + " " + partido.getEquipoVisitante());
            contadorEmpates++;
        }
        System.out.println("Total de partidos que terminaron en empate: " + contadorEmpates);
    }

    private static void contarYMostrarPartidosGanadosPorElLocal(ArrayList<PartidoFutbol> partidos) {
        int victoriasLocales = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGalLocal() > partido.getGolVisitante()) {
                victoriasLocales++;
            }
        }
        System.out.println("\nPartidos ganados por el equipo local: " + victoriasLocales);
    }
}
