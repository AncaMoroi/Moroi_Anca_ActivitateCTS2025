package Comportamentale3.ChainOfResponsabilities3;

import java.util.Date;

public class Technician extends Verificator{
    @Override
    public void procesareCerere(Masina masina) {
        Date currentDate = new Date();
        if (masina.getRcaValabil().before(currentDate)) {
            System.out.println("rca a expirat");
        }else {
            System.out.println("RCA-ul e valabi");
            if (this.getNextHandler()!= null) {
                this.getNextHandler().procesareCerere(masina);
            }
        }
    }
}
