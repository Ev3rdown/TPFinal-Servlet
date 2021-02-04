package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Facture;

public class FactureDaoImpl implements FactureDao {
    EntityManager em;
    UserTransaction utx;
    public FactureDaoImpl(EntityManager em,UserTransaction utx){
        this.utx=utx;
        this.em=em;
    }
    public List<Facture> getFactures(){
        return em.createQuery("SELECT f FROM Facture f ORDER BY f.date",Facture.class)
            .getResultList();
    }
    public Facture getFactureByNumero(String numero) {
        // Attention au JOIN FETCH qui permet d'éviter une erreur liée au lazy loading hibernate
        return em.createQuery("SELECT f FROM Facture f JOIN FETCH f.lignesFacture l WHERE f.numero=:numero ORDER BY f.date",Facture.class)
            .setParameter("numero", numero)
            .getResultList().get(0);
    }
}
