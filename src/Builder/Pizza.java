package Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends APizza{
    public Pizza(ETipBlat eTipBlat, List<IIncrediente> incredientes, int pret) {
        super(eTipBlat, incredientes, pret);
    }

    void addIncrediente(IIncrediente incrediente) {
        if(this.incredientes==null) {
            this.incredientes = new ArrayList<>();
        }
        if (this.incredientes!= null){
            this.incredientes.add(incrediente);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "eTipBlat=" + eTipBlat +
                ", incredientes=" + incredientes +
                ", pret=" + pret +
                '}';
    }
}
