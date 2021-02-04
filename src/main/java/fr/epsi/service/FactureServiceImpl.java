package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.FactureDao;
import fr.epsi.dao.FactureDaoImpl;
import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {
    @PersistenceContext
    public EntityManager em;

    @Resource
    private UserTransaction utx;

    public List<Facture> getFactures() {
        FactureDao dao = new FactureDaoImpl(em, utx);
		return dao.getFactures();
    }
    public Facture getFactureByNumero(String numero){
        FactureDao dao = new FactureDaoImpl(em, utx);
		return dao.getFactureByNumero(numero);
    }
    

}
