package Exercitiu4;

public class Casa {
    private int etaje;
    private String acoperis;
    private int nrUsi;
    CuloareCasa cs;

    public Casa(int etaje, String acoperis, int nrUsi, CuloareCasa cs) {
        this.etaje = etaje;
        this.acoperis = acoperis;
        this.nrUsi = nrUsi;
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "etaje=" + etaje +
                ", acoperis='" + acoperis + '\'' +
                ", nrUsi=" + nrUsi +
                ", cs=" + cs +
                '}';
    }
}
