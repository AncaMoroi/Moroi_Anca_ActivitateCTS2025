package Exercitii2;

public class Mail implements Rasouns {
    private int nume;
    private String mail;

    public Mail(int nume, String mail) {
        this.nume = nume;
        this.mail = mail;
    }

    @Override
    public void afisareRaspuns() {
        System.out.println("Utilizatorul: " + nume + " va fi instiintat la adresa: " + mail);
    }
}
