package Builder;

import java.util.List;

public class BuilderPizza implements IPizza {
    private Dimensiune dimensiune;
    private List<IIncrediente> listIncrdiente = null;
    private int pret;

    public BuilderPizza(Dimensiune dimensiune, List<IIncrediente> listIncrdiente, int pret) {
        this.dimensiune = dimensiune;
        this.listIncrdiente = listIncrdiente;
        this.pret = pret;
    }

    @Override
    public Pizza build() {
        ETipBlat tipBlat = ETipBlat.SUBTIRE; // fallback default

        // Dacă primul ingredient este un blat, folosim tipul lui
        if (listIncrdiente != null && !listIncrdiente.isEmpty() && listIncrdiente.get(0) instanceof Blat) {
            tipBlat = listIncrdiente.get(0).getTipBlat(); // va fi null momentan în Blat (trebuie corectat!)
        }

        return new Pizza(tipBlat, listIncrdiente, pret);
    }
}
