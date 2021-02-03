package fr.epsi.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * ? Classe ligneFacture créée selon le diagramme du documment
 */

@Entity
public class LigneFacture {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private int qte;
    private double prix;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Article article;
    
    public LigneFacture(){
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }
    public double getPrix() {
        return prix;
    }
    public int getQte() {
        return qte;
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public Article getArticle() {
        return article;
    }
    

}
