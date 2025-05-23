package Comportamentale.ChainOfResponsabilities;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Nu avem date de contact pentru " + client.getNume());
    }
}
