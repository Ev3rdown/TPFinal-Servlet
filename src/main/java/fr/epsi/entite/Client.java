package fr.epsi.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * ? Classe Client créée selon le diagramme du documment
 */

@Entity
public class Client {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "client")
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
