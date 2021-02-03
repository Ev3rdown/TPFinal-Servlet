package fr.epsi.entite;

/**
 * ? Classe Article créée selon le diagramme du documment
 */

public class Article {

    private String nom;
    private Double prix;

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
