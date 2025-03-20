package Factory1;

public class CercFactory implements FactoryForma{
    @Override
    public Forma creareForma() {
        return new Cerc();
    }
}
