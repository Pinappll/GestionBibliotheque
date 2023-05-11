package control;

import Utility.NosExceptions;
import java.util.ArrayList;
import objets_metiers.Usager;
/**
 * 
 * @author Joshua et valence
 */
public class UsagerControl {

    public static void ajouter(Usager usager) throws NosExceptions {
        //Verifier la validité des informations
        usager.setNom(usager.getNom());
        usager.setPrenom(usager.getPrenom());
        usager.setDateNais(usager.getDateNais());
        usager.setSexe(usager.getSexe());
        usager.setAdresse(usager.getAdresse());
        usager.setTel(usager.getTel());

        usager.ajouter(usager);
    }

    public static void modifier(Usager usager) throws NosExceptions {
        //Verifier que les informations sont valides
        usager.setNom(usager.getNom());
        usager.setPrenom(usager.getPrenom());
        usager.setDateNais(usager.getDateNais());
        usager.setSexe(usager.getSexe());
        usager.setAdresse(usager.getAdresse());
        usager.setTel(usager.getTel());

        usager.modifier(usager);
    }

    public static void supprimer(Usager usager) throws NosExceptions {
        usager.delete(usager);
    }

    public static Usager findById(int id) throws NosExceptions {
        return new Usager().findById(id);
    }

    public static ArrayList<Usager> findByNom(String nom) throws NosExceptions {
        return new Usager().findByNom(nom);
    }
    
    public static ArrayList<Usager> getListUsagers() throws NosExceptions {
        return new Usager().getListUsagers();
    }
}
