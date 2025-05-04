package Creationale.Singleton.EagerInitialization;

public class ConectareDB {
    private static final ConectareDB instance = new ConectareDB();
    String cale;
    int nrUtilizari;

    private ConectareDB() {
        this.cale = "//atrbg";
        this.nrUtilizari = 4;
    }

    public String getCale() {
        return cale;
    }

    public int getNrUtilizari() {
        return nrUtilizari;
    }

    public static ConectareDB getInstance()
    {
        return instance;
    }



}
