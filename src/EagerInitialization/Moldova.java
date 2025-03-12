package EagerInitialization;

public class Moldova {
    private String oras;
    private int facultati;

    private static final Moldova instantaM = new Moldova();
    private Moldova() {
        this.oras = "Iasi";
        this.facultati = 2;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getFacultati() {
        return facultati;
    }

    public void setFacultati(int facultati) {
        this.facultati = facultati;
    }

    public static Moldova getInstantaM () {
        return instantaM;
    }
}
