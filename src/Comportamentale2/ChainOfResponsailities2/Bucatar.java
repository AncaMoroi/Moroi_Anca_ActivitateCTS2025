package Comportamentale2.ChainOfResponsailities2;

public class Bucatar extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getCantitate()>5) {
            System.out.println("Bucatarul pregateste comanda: " + comanda.getProdus());
        }
        else if(this.getNextHandler()!=null) {
            System.out.println("Bucatarul nu poate procesa comanda");
            this.getNextHandler().procesareComanda(comanda);
        }
        else {
            System.out.println("Se asteapta procesarea comenzii");
        }
    }
}
