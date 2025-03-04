package Continente;

public class Asia {
    private static Asia instanta = null;
    private String tara;
    private String religie;

    private Asia(String tara, String religie) {
        this.religie = religie;
        this.tara = tara;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getReligie() {
        return religie;
    }

    public void setReligie(String religie) {
        this.religie = religie;
    }

    public static Asia getInstanta(String tara, String religie) {
        if (instanta == null) {
            instanta = new Asia(tara, religie);
        }
        return instanta;
    }
}
