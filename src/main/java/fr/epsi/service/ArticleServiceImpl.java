package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImpl;
import fr.epsi.entite.Article;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	public EntityManager em;

	@Resource
	private UserTransaction utx;

	public void createArticle(String nom,Double prix) {
		Article article = new Article();
		article.setNom(nom);
		article.setPrix(prix);
		ArticleDao dao = new ArticleDaoImpl(em, utx);
		dao.createArticle(article);
	}
	public List<Article> getArticles() {
		ArticleDao dao = new ArticleDaoImpl(em, utx);
		return dao.getArticles();
	}

}
