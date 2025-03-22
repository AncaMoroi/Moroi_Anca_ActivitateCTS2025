package Prototype;

import java.util.ArrayList;

public abstract class ProtocoaleSpital implements Cloneable{
    private String Sectie;
    private int id;
    protected ArrayList<String> listaMedicamente;

    public void modifcListaMedicamente(int i, String listaMedicament) {
        listaMedicamente.set(i,listaMedicament);
    }

    abstract void afisare();

    public String getSectie() {
        return Sectie;
    }

    public void setSectie(String sectie) {
        Sectie = sectie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getListaMedicamente() {
        return listaMedicamente;
    }

    @Override
    public String toString() {
        return "Prototype.ProtocoaleSpital{" +
                "Sectie='" + Sectie + '\'' +
                ", id=" + id +
                ", listaMedicamente=" + listaMedicamente +
                '}';
    }

    @Override
    protected ProtocoaleSpital clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (ProtocoaleSpital) clone;
    }
}
