package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.service.FactureService;

@WebServlet("/facture")
public class FactureServlet extends HttpServlet{
	private static final long serialVersionUID = 2175487377313847924L;

	@EJB
	private FactureService factureService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			if(req.getParameter("action")==null){
				
				req.setAttribute("listFactures", factureService.getFactures());
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/FacturePage.jsp").forward(req, resp);

			}else if(req.getParameter("action").equals("detail")) {
				System.out.println("initial");
				Facture facture = factureService.getFactureByNumero(req.getParameter("numero"));
				req.setAttribute("facture", facture);
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/FactureDetail.jsp").forward(req, resp);

			} else {
				resp.sendRedirect(req.getContextPath() + "/facture");
			}
	    }

}