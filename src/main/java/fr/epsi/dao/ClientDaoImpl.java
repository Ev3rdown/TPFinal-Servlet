package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Client;

public class ClientDaoImpl implements ClientDao {
    EntityManager em;
    UserTransaction utx;
    public ClientDaoImpl(EntityManager em,UserTransaction utx){
        this.utx=utx;
        this.em=em;
    }
    public List<Client> getClients(){
        return em.createQuery("SELECT c FROM Client c ORDER BY c.nom",Client.class)
            .getResultList();
    }
    public void createClient(Client c) {
        try {
            utx.begin();
            em.persist(c);
            utx.commit();    
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (RollbackException e) {
                e.printStackTrace();
            } catch (HeuristicMixedException e) {
                e.printStackTrace();
            } catch (HeuristicRollbackException e) {
                e.printStackTrace();
            } catch (NotSupportedException e) {
                e.printStackTrace();
        } catch (SystemException e){

        }
    }
}
