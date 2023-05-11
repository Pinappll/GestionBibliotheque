package control;

import Utility.NosExceptions;
import java.util.ArrayList;
import objets_metiers.Oeuvre;
/**
 * 
 * @author Joshua et valence
 */
public class OeuvreControl {

    public static void ajouter(Oeuvre oeuvre) throws NosExceptions {
        //Verifier la validité des informations
        oeuvre.setTitre(oeuvre.getTitre());
        oeuvre.setAuteur(oeuvre.getAuteur());
        oeuvre.setCategorie(oeuvre.getCategorie());

        oeuvre.ajouter(oeuvre);
    }

    public static void modifier(Oeuvre oeuvre) throws NosExceptions {
        oeuvre.setId(oeuvre.getId());
        oeuvre.setTitre(oeuvre.getTitre());
        oeuvre.setAuteur(oeuvre.getAuteur());
        oeuvre.setCategorie(oeuvre.getCategorie());
        oeuvre.setNbResa(oeuvre.getNbResa());

        oeuvre.modifier(oeuvre);
    }

    public static void supprimer(Oeuvre oeuvre) throws NosExceptions {
        oeuvre.delete(oeuvre);
    }
    public static Oeuvre findById(int id) throws NosExceptions {
        Oeuvre oeuvre = new Oeuvre();
        return oeuvre.findById(id);
    }

    public static ArrayList<Oeuvre> findByTitre(String titre) throws NosExceptions {
        //Oeuvre oeuvre = new Oeuvre();
        return new Oeuvre().findByTitre(titre);
    }
    public static ArrayList<Oeuvre> getListOeuvres() throws NosExceptions {
        return new Oeuvre().getListOeuvres();
    }
    
}
