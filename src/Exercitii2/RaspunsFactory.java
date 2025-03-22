package Exercitii2;

public class RaspunsFactory {
    public static Rasouns trimiteRaspund(TipRaspuns tipRaspuns, String nume, int param)throws Exception {
        switch (tipRaspuns) {
            case MAIL:
                return new Mail(param, nume);
            case TELEFON:
                return new Telefon(param,nume);
            default:
                throw new Exception("Alege o modalitate de notificare");

        }

    }
}
