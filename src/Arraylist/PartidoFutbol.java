package Arraylist;

public class PartidoFutbol {
    private String equipoLocal;
    private String equipoVisitante;
    private int galLocal;
    private int golVisitante;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGalLocal() {
        return galLocal;
    }

    public void setGalLocal(int galLocal) {
        this.galLocal = galLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public PartidoFutbol(String equipoLocal, String equipoVisitante, int galLocal, int golVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.galLocal = galLocal;
        this.golVisitante = golVisitante;
    }

    public PartidoFutbol() {
    }
}
