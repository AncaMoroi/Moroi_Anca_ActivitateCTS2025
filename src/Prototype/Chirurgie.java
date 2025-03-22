package Prototype;

import java.util.ArrayList;

public  class Chirurgie extends ProtocoaleSpital{
    public Chirurgie() {

        listaMedicamente.add("Anestezic general");
        listaMedicamente.add("Antibiotic post-operator");
        this.setId(1);
        this.setSectie("Chirurgie");

    }

    @Override
    void afisare() {
        System.out.println("Protocol" + this.getSectie());
    }
}
