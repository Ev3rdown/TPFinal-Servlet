package fr.epsi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// L'usage de "/client" provoque chez moi une erreur pour laquelle je n'ai pas envie de perdre mon temps. 
// J'utilise donc ListeClient, que j'ai aussi modifié dans le fichier du header.
@WebServlet("/ListeClient")
public class ClientServlet extends HttpServlet{
	private static final long serialVersionUID = 2175487377313847924L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ClientPage.jsp").forward(req, resp);
	    }

}