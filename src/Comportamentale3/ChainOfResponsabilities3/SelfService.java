package Comportamentale3.ChainOfResponsabilities3;

public class SelfService extends Verificator{
    @Override
    public void procesareCerere(Masina masina) {
        if (masina.getLocuriLibere() < 1) {
            System.out.println("Nu va putem primit azi in service");
        }else {
            System.out.println("Va rugam sa parcati");
        }
    }
}
