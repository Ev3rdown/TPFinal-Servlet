package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Article;

public interface ArticleDao {
    
    void createArticle(Article a);
    List<Article> getArticles();
    
}
