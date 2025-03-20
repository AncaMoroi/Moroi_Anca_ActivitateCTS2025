package SimpleFactory;

public class VehiculFactory {
    public static Vehicul creareVehicul(TipVehicul tipVehicul, String marca, int param) throws Exception {
        switch (tipVehicul) {
            case Masina:
                return new Masina(marca, param);
            case Avion:
                return new Avion(marca, param);
            default:
                throw new Exception("Tip Invalid vehicul");
        }
    }
}
