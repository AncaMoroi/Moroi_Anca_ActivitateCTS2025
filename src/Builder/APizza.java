package Builder;

import java.util.List;

public class APizza {
    protected ETipBlat eTipBlat;
    protected List<IIncrediente> incredientes = null;
    protected int pret;

    public APizza(ETipBlat eTipBlat, List<IIncrediente> incredientes, int pret) {
        super();
        this.eTipBlat = eTipBlat;
        this.incredientes = incredientes;
        this.pret = pret;
    }
}
