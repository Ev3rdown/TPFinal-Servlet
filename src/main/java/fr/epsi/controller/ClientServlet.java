package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.ClientService;

// L'usage de "/client" provoque chez moi une erreur pour laquelle je n'ai pas envie de perdre mon temps. 
// J'utilise donc ListeClient, que j'ai aussi modifié dans le fichier du header.
@WebServlet("/ListeClient")
public class ClientServlet extends HttpServlet{
	private static final long serialVersionUID = 2175487377313847924L;

	@EJB
	private ClientService clientService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			//Si le ?action= n'est pas présent:
			if(req.getParameter("action")==null){
				req.setAttribute("listClients", clientService.getClients());
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ClientPage.jsp").forward(req, resp);
			//Si il vaut =create :
			}else if(req.getParameter("action").equals("create")) {
				System.out.println("client create");
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ClientCreate.jsp").forward(req, resp);
			//Sinon, si ?action= n'est pas une valeur valide
			} else {
				resp.sendRedirect(req.getContextPath() + "/ListeClient");
			}
		}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
		{
			//Si le POST contient une valeur ?actionPost=create
			if(req.getParameter("actionPost").equals("create")) {
				String nomClient = req.getParameter("nomClient");
				String adresseClient = req.getParameter("adresseClient");
				//on créer un nouveau client
				clientService.createClient(nomClient,adresseClient);
				//puis on redirige vers la page d'origine, pour eviter un doublon en cas de f5 etc
				resp.sendRedirect(req.getContextPath() + "/ListeClient");
			} else {
				//si le post n'est pas valide, on redirige
				resp.sendRedirect(req.getContextPath() + "/ListeClient");
			}
		}
		

}