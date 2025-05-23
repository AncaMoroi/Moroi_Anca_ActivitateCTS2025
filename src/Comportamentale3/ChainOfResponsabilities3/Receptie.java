package Comportamentale3.ChainOfResponsabilities3;

public class Receptie extends Verificator{

    @Override
    public void procesareCerere(Masina masina) {
        if (masina.getMarca() != null && masina.isProgramare()){
            System.out.println("Masina va trece mai departe la verificar rc: " + masina.getRcaValabil());
            if(this.getNextHandler()!= null) {
                this.getNextHandler().procesareCerere(masina);
            }
        }else {
            System.out.println("Masina trebuie programata");
        }
    }
}
