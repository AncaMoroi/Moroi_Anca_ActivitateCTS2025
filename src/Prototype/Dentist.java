package Prototype;

import java.util.ArrayList;

public  class Dentist extends ProtocoaleSpital {
    public Dentist() {
        listaMedicamente = new ArrayList<>();
        listaMedicamente.add("Anestezic general dentist");
        listaMedicamente.add("Antibiotic post-operator dentist");
        this.setId(2);
        this.setSectie("Dentie");

    }

    @Override
    void afisare() {
        System.out.println("Protocol" + this.getSectie());
    }

    @Override
    protected ProtocoaleSpital clone() {
        ProtocoaleSpital clone = super.clone();
        clone.listaMedicamente = new ArrayList<>();
        for (int i = 0; i < this.listaMedicamente.size(); i++) {
            clone.listaMedicamente.add(new String(this.listaMedicamente.get(i)));
        }
        return clone;
    }
}
