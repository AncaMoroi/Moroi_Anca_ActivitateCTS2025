package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeSpital {
    private static Map<String, ProtocoaleSpital> prototipSectii = new HashMap<>();

    static {
        Chirurgie chirurgie = new Chirurgie();
        prototipSectii.put("Chirurgie", chirurgie);

        Dentist dentist = new Dentist();
        prototipSectii.put("Dentist", dentist);
    }

    public static ProtocoaleSpital getPrototipSectii(String sectie) {
        ProtocoaleSpital ps = null;
        ProtocoaleSpital protocoaleSpital = prototipSectii.get(sectie);
        if (protocoaleSpital != null)
            ps = protocoaleSpital.clone();
            return ps;

    }
}
