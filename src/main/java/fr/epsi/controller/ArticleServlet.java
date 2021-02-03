package fr.epsi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/article")
public class ArticleServlet extends HttpServlet{
	private static final long serialVersionUID = 2175487377313847924L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			if(req.getParameter("action")==null){
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);

			}else if(req.getParameter("action").equals("create")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticleCreate.jsp").forward(req, resp);
				
			} else {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);
			}
		}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
		{
			if(req.getParameter("actionPost")==null){
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);

			}else if(req.getParameter("actionPost").equals("create")) {
				String nomArticle = req.getParameter("nomArticle");
				Double prix = Double.valueOf(req.getParameter("prixArticle"));
				

				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);
				
			} else {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ArticlePage.jsp").forward(req, resp);
			}
		}

}