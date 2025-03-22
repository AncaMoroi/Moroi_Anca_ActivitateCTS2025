package Builder;

public class Blat implements IIncrediente{
    private ETipBlat eTipBlat;
    private String denumire;

    public Blat(ETipBlat eTipBlat, String denumire) {
        super();
        this.eTipBlat = eTipBlat;
        this.denumire = denumire;
    }

    @Override
    public ETipBlat getTipBlat() {
        return this.eTipBlat;
    }

    @Override
    public String toString() {
        return "Blat{" +
                "eTipBlat=" + eTipBlat +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
