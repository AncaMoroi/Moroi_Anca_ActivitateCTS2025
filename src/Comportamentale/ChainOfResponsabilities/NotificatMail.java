package Comportamentale.ChainOfResponsabilities;

public class NotificatMail extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresa_mail()!=null)
            System.out.println(client.getNume() + "ai un mail" + mesaj);
        else
            super.getUrmatorulNotificaor().notifica(client, mesaj);
    }
}
