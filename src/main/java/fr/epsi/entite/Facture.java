package fr.epsi.entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * ? Classe Facture créée selon le diagramme du documment
 */

@Entity
public class Facture {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String numero;
    private Double prix;
    private Date date;

    @ManyToOne
    private Client client;
    
    @OneToMany(mappedBy = "facture")
    private List<LigneFacture> lignesFacture;

    public Facture(){
        lignesFacture = new ArrayList<LigneFacture>();
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getNumero() {
        return numero;
    }
    public Double getPrix() {
        return prix;
    }
    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<LigneFacture> getLignesFacture() {
        return lignesFacture;
    }
    public void addLigneFacture(LigneFacture lF){
        lignesFacture.add(lF);
    }
    
}
