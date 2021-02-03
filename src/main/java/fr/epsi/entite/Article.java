package fr.epsi.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * ? Classe Article créée selon le diagramme du documment
 */

@Entity
public class Article {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    private Double prix;

    @OneToMany(mappedBy = "article")
    private List<LigneFacture> ligneFactures;

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public String getNom() {
        return nom;
    }
    public Double getPrix() {
        return prix;
    }
}
