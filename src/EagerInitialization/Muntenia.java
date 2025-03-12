package EagerInitialization;

public class Muntenia {
    private String orase;
    private int populatie;

    private static final Muntenia instante = new Muntenia();


    private Muntenia() {
        this.orase = "Constanta";
        this.populatie = 17000;
    }

    public String getOrase() {
        return orase;
    }

    public void setOrase(String orase) {
        this.orase = orase;
    }

    public int getPopulatie() {
        return populatie;
    }

    public void setPopulatie(int populatie) {
        this.populatie = populatie;
    }

    public static Muntenia getInstante() {
        return instante;
    }
}
