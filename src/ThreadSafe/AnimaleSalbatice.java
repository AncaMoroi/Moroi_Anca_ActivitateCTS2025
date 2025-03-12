package ThreadSafe;

public class AnimaleSalbatice {
    private String specie;
    private String regiune;

    private static AnimaleSalbatice instantaAS =null;

    private AnimaleSalbatice(String specie, String regiune) {
        this.specie = specie;
        this.regiune = regiune;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    public static synchronized AnimaleSalbatice getInstantaAS(String specie, String regiune) {
        return instantaAS;
    }
}
