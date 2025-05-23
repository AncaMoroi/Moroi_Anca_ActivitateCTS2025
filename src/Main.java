
import Comportamentale.ChainOfResponsabilities.*;
import Comportamentale2.ChainOfResponsailities2.Bucatar;
import Comportamentale2.ChainOfResponsailities2.BucatarSef;
import Comportamentale2.ChainOfResponsailities2.Comanda;
import Comportamentale2.ChainOfResponsailities2.Ospatar;
import Comportamentale3.ChainOfResponsabilities3.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        //ChainOfResponsabilities
        Notificator notificatorSMS = new NotificariSMS();
        Notificator notificatorMal = new NotificatMail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificaor(notificatorMal);
        notificatorMal.setUrmatorulNotificaor(notificatorManager);

        Client client = new Client("Anca", null, null);
        notificatorSMS.notifica(client, "Test");


        //chainOfResponsabilies2

        Ospatar ospatar = new Ospatar();
        Bucatar bucatar = new Bucatar();
        BucatarSef bucatarSef = new BucatarSef();

        ospatar.setNextHandler(bucatar);
        bucatar.setNextHandler(bucatarSef);

        Comanda cmd1 = new Comanda("Pizza", 5, 12);
        Comanda cm2 = new Comanda("Paste", 2, 3);

        System.out.println("Comanda1");
        ospatar.procesareComanda(cmd1);

        System.out.println("Comanda2");
        ospatar.procesareComanda(cm2);


        Verificator receptie = new Receptie();
        Verificator ss = new SelfService();
        Verificator teh = new Technician();

        receptie.setNextHandler(teh);
        teh.setNextHandler(ss);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dataRCA = null;
        try {
            dataRCA = sdf.parse("25-06-2025");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date dataRCAa = null;
        try {
            dataRCAa = sdf.parse("25-06-2024");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Masina masina1 = new Masina("Honda", true, dataRCA, 4);
        Masina masina2 = new Masina("Dacia", false, dataRCAa, 1);

        System.out.println("--------- Verificare masina 1 ---------");
        receptie.procesareCerere(masina1);

        System.out.println("--------- Verificare masina 2 ---------");
        receptie.procesareCerere(masina2);


    }
}
