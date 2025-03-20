package SimpleFactory;

public class Avion implements Vehicul{
    String marca;
    int nrLocuri;

    public Avion(String marca, int nrLocuri) {
        this.marca = marca;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afisareComponente() {
        System.out.println("Avionul: " +  marca + " are: " + nrLocuri + " numar de locuri");
    }
}
