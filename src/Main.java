import Continente.Asia;
import Continente.Europa;

public class Main {
    public static void main(String[] args) {
        Europa europa = Europa.getInstance("Romania", "romana");
        Europa e = Europa.getInstance("Franta", "franceza");
        System.out.println(europa.getLbVorbita());
        System.out.println(europa.getLbVorbita());

        Asia asia = Continente.Asia.getInstanta("Tailanda", "hindusa");
        System.out.println(asia.getReligie());
    }
}