package Factory1;

public class DreptunghiFactory implements FactoryForma{
    @Override
    public Forma creareForma() {
        return new Dreptunghi();
    }
}
