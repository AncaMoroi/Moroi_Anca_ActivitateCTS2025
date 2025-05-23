package Comportamentale.ChainOfResponsabilities;

public class NotificariSMS extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNr_telefon()!=null)
            System.out.println(client.getNume() + "ai primit un sms:" + mesaj);
        else
            super.getUrmatorulNotificaor().notifica(client, mesaj);
    }
}
