package Exercitiu3;

public class MeniuVegetarian implements Meniu{
     boolean areCarne;
     int nrPortii;

    public MeniuVegetarian(boolean areCarne, int nrPortii) {
        this.areCarne = areCarne;
        this.nrPortii = nrPortii;
    }

    @Override
    public void afiseaza() {
        System.out.println("Meniu vegetarian este" + areCarne + " si contine portii: " + nrPortii);
    }
}
