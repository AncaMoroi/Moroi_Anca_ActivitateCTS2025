package PregatireTest;

public class ConfigurationManager {
    private static final ConfigurationManager instance = new ConfigurationManager("Dell",40);
    private String nume;
    private int nrLaptopuri;

    private ConfigurationManager(String nume, int nrLaptopuri){
        this.nume = nume;
        this.nrLaptopuri = nrLaptopuri;
    }



    public String getNume() {
        return nume;
    }

    public int getNrLaptopuri() {
        return nrLaptopuri;
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }
}
