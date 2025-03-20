package SimpleFactory;

public class Masina implements Vehicul{
    private String marca;
    int nrComponente;

    public Masina(String marca, int nrComponente) {
        this.marca = marca;
        this.nrComponente = nrComponente;
    }

    @Override
    public void afisareComponente() {
        System.out.println("Masina este marca: " + marca + "si are un numar de: " + nrComponente + " componente" );
    }
}
