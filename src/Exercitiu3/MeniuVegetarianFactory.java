package Exercitiu3;

import Factory1.FactoryForma;
import Factory1.Forma;

public class MeniuVegetarianFactory implements FactoryManu {
    @Override
    public Meniu creareManu() {
        return new MeniuVegetarian(false,2);
    }
}
