package Comportamentale3.ChainOfResponsabilities3;

import java.util.Date;

public class Masina {
    private String marca;
    private boolean programare;
    private Date rcaValabil;
    private int locuriLibere;

    public Masina(String marca, boolean programare, Date rcaValabil, int locuriLibere) {
        this.marca = marca;
        this.programare = programare;
        this.rcaValabil = rcaValabil;
        this.locuriLibere = locuriLibere;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isProgramare() {
        return programare;
    }

    public void setProgramare(boolean programare) {
        this.programare = programare;
    }

    public Date getRcaValabil() {
        return rcaValabil;
    }

    public void setRcaValabil(Date rcaValabil) {
        this.rcaValabil = rcaValabil;
    }

    public int getLocuriLibere() {
        return locuriLibere;
    }

    public void setLocuriLibere(int locuriLibere) {
        this.locuriLibere = locuriLibere;
    }
}
