package Exercitii2;

public class Telefon implements Rasouns {
    String nume;
    int nrTelefon;

    public Telefon(int nrTelefon, String nume) {
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    @Override
    public void afisareRaspuns() {
        System.out.println("Clientul: " + nume + "va fi notificat prin SMS la nr de tel: " + nrTelefon);
    }
}
