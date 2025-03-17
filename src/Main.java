import Continente.Asia;
import Continente.Europa;
import EagerInitialization.Moldova;
import PregatireTest.ConfigurationManager;
import ThreadSafe.AnimaleDomestice;

public class Main {
    public static void main(String[] args) {
        //Singleton lazy innitialization
        Europa europa = Europa.getInstance("Romania", "romana");
        Europa e = Europa.getInstance("Franta", "franceza");
        System.out.println(europa.getLbVorbita());
        System.out.println(europa.getLbVorbita());

        Asia asia = Asia.getInstanta("Tailanda", "hindusa");
        System.out.println(asia.getReligie());

        //eagerinitialization
        Moldova moldova = Moldova.getInstantaM();
        System.out.println(moldova.getOras());
        System.out.println(moldova.getFacultati());

        //threadSafe
        AnimaleDomestice animalDomestic1 = AnimaleDomestice.getInstantaAD("Gaina", AnimaleDomestice.tipAnimal.DE_CONSUM);
        System.out.println(animalDomestic1.getSpecie());
        System.out.println(animalDomestic1.getTip());

        //
        ConfigurationManager config = ConfigurationManager.getInstance();

      
        System.out.println(config.getNume());


    }
}