package Comportamentale.ChainOfResponsabilities;

public abstract class Notificator {
    private Notificator urmatorulNotificaor;

    public Notificator getUrmatorulNotificaor() {
        return urmatorulNotificaor;
    }

    public void setUrmatorulNotificaor(Notificator urmatorulNotificaor) {
        this.urmatorulNotificaor = urmatorulNotificaor;
    }
    public abstract void notifica(Client client, String mesaj);
}
