package Exercitiu4;

public class CasaBuilder {
    private int etaje = 1;
    private String acoperis = "standard";
    private int nrUsi = 1;
    private CuloareCasa cs = CuloareCasa.ALBA;

    public int getEtaje() {
        return etaje;
    }

    public CasaBuilder setEtaje(int etaje) {
        this.etaje = etaje;
        return this;
    }


    public CasaBuilder setAcoperis(String acoperis) {
        this.acoperis = acoperis;
        return this;
    }


    public CasaBuilder setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
        return this;
    }


    public CasaBuilder setCs(CuloareCasa cs) {
        this.cs = cs;
        return this;
    }

    public Casa build() {
        return new Casa(etaje,acoperis,nrUsi,cs);
    }
}
