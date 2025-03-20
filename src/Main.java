import Continente.Asia;
import Continente.Europa;
import EagerInitialization.Moldova;
import Factory1.CercFactory;
import Factory1.DreptunghiFactory;
import Factory1.FactoryForma;
import Factory1.Forma;
import PregatireTest.ConfigurationManager;
import SimpleFactory.TipVehicul;
import SimpleFactory.Vehicul;
import SimpleFactory.VehiculFactory;
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


        //Factory Metod
        FactoryForma ff1 = null;
        ff1 = new CercFactory();

        Forma forma = null;
        forma = ff1.creareForma();
        forma.deseneaza();

        //Simple factory
        try {
            Vehicul masina = VehiculFactory.creareVehicul(TipVehicul.Masina, "Honda", 800);
            masina.afisareComponente();

            Vehicul avion = VehiculFactory.creareVehicul(TipVehicul.Avion, "Boeing", 280);
            avion.afisareComponente();
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        }

    }
