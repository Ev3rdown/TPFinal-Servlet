package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Article;

public interface ArticleService {
	
	public void createArticle(String nom,Double prix);
	public List<Article> getArticles();
}
