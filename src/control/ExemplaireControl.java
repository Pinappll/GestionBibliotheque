package control;

import Utility.NosExceptions;
import java.util.ArrayList;
import objets_metiers.Exemplaire;
import objets_metiers.Oeuvre;
/**
 * 
 * @author Joshua et valence
 */
public class ExemplaireControl {

    public static void ajouter(Oeuvre oeuvre, String etatExemplaire) throws NosExceptions {
         oeuvre = oeuvre.findById(oeuvre.getId());
        if (null == oeuvre) {
            throw new NosExceptions("L'oeuvre n'existe pas");
        }
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.ajouter(oeuvre, etatExemplaire);
    }

    public static void modifier(Exemplaire exemplaire) throws NosExceptions {
        exemplaire.setId(exemplaire.getId());
        exemplaire.setEtat(exemplaire.getEtat());

        exemplaire.modifier(exemplaire);
    }

    public static void supprimer(Exemplaire exemplaire) throws NosExceptions {
        exemplaire.delete(exemplaire);
    }

    public static Exemplaire findById(int id) throws NosExceptions {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findById(id);
    }

    public static ArrayList<Exemplaire> findExemplaireDispo(Oeuvre oeuvre) throws NosExceptions {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findExemplaireDispo(oeuvre);
    }

    public static ArrayList<Exemplaire> find(Oeuvre oeuvre) throws NosExceptions {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.find(oeuvre);
    }
}
