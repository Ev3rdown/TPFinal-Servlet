package fr.epsi.entite;

import java.util.ArrayList;
import java.util.List;

/**
 * ? Classe Client créée selon le diagramme du documment
 */

public class Client {
    private String nom;
    private String adresse;

    private List<Facture> factures;

    public Client(){
        factures = new ArrayList<Facture>();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }

    public List<Facture> getFactures() {
        return factures;
    }
    public void addFacture(Facture facture){
        factures.add(facture);
    }
}
