package fr.epsi.entite;

import java.util.ArrayList;
import java.util.List;

/**
 * ? Classe ligneFacture créée selon le diagramme du documment
 */

public class LigneFacture {
    private int qte;
    private double prix;

    private List<Article> articles;
    
    public LigneFacture(){
        articles = new ArrayList<Article>();
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
    
    public List<Article> getArticles() {
        return articles;
    }
    public void addArticle(Article article){
        articles.add(article);
    }

}
