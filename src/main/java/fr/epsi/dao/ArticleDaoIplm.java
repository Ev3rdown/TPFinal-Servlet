package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;

public class ArticleDaoIplm implements ArticleDao {
    EntityManager em;
    UserTransaction utx;
    public ArticleDaoIplm(EntityManager em,UserTransaction utx){
        this.utx=utx;
        this.em=em;
    }
    public void createArticle(Article a) {
        try {
            utx.begin();
            em.persist(a);
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
    public List<Article> getArticles(){
        return em.createQuery("SELECT a FROM Article a ORDER BY a.nom",Article.class)
            .getResultList();
    }
}
