package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.ArticleService;

@WebServlet("/article")
public class ArticleServlet extends HttpServlet{
	private static final long serialVersionUID = 2175487377313847924L;

	@EJB
	private ArticleService articleService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			if(req.getParameter("action")==null){
				req.setAttribute("listArticles", articleService.getArticles());
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);

			}else if(req.getParameter("action").equals("create")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticleCreate.jsp").forward(req, resp);
				
			} else {
				req.setAttribute("listArticles", articleService.getArticles());
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);
			}
		}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
		{
			if(req.getParameter("actionPost").equals("create")) {
				String nomArticle = req.getParameter("nomArticle");
				Double prixArticle = Double.valueOf(req.getParameter("prixArticle"));
				articleService.createArticle(nomArticle,prixArticle);
				System.out.println("persisted");
				//redirect
			} else {
				// redirect
			}
		}

}