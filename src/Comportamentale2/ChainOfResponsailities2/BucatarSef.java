package Comportamentale2.ChainOfResponsailities2;

public class BucatarSef extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        System.out.println("Bucatarul sef a procesat comanda " + comanda.getProdus());
    }
}
