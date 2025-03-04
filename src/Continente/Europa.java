package Continente;

public class Europa {

    //pentru singleton adaug urmatoarea linie:
    private static Europa instance = null;

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getLbVorbita() {
        return lbVorbita;
    }

    public void setLbVorbita(String lbVorbita) {
        this.lbVorbita = lbVorbita;
    }

    private String tara;
    private String lbVorbita;

    //mereu constructorul clase singletin va fi PRIVATA!!!
    private Europa(String tara, String lbVorbita) {
        this.tara = tara;
        this.lbVorbita = lbVorbita;
    }

    // Metodă pentru a obține instanța Singleton
    public static Europa getInstance(String tara, String lbVorbita) {
        if (instance == null) {
            instance = new Europa(tara,lbVorbita);
        }
        return instance;
    }
}
