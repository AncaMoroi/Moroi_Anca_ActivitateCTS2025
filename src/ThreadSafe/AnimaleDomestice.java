package ThreadSafe;

public class AnimaleDomestice {
    private String specie;
    private tipAnimal tip;

    public enum tipAnimal {
        DE_COMPANIE,
        DE_CONSUM
    }

    //pt multi threads putem folosi volatile in loc de static pentru a ramane o instanta pt toate threadurile
    private static AnimaleDomestice instantaAD = null;

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public tipAnimal getTip() {
        return tip;
    }

    public void setTip(tipAnimal tip) {
        this.tip = tip;
    }

    private AnimaleDomestice(String specie, tipAnimal tip) {
        this.specie = specie;
        this.tip = tip;
    }

    public static synchronized AnimaleDomestice getInstantaAD(String specie, tipAnimal tip) {
        if(instantaAD == null)
            instantaAD = new AnimaleDomestice(specie, tip);
        return instantaAD;
    }
}
