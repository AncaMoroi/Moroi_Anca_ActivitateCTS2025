package Singleton.Ex1;

public class Eager1 {

    private static final Eager1 instanta = new Eager1();
    private String appNume;
    private int nrMaxUtilizatori;

    private Eager1() {
        this.appNume = "Nume Ap";
        this.nrMaxUtilizatori = 3;
    }

    public String getAppNume() {
        return appNume;
    }

    public int getNrMaxUtilizatori() {
        return nrMaxUtilizatori;
    }

    public void setAppNume(String appNume) {
        this.appNume = appNume;
    }

    public void setNrMaxUtilizatori(int nrMaxUtilizatori) {
        this.nrMaxUtilizatori = nrMaxUtilizatori;
    }

    public static Eager1 getInstanta() {
        return instanta;
    }
}
