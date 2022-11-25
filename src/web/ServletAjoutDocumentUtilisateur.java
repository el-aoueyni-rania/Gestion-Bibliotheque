package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Document;
import metier.DocumentMetierImpl;
import metier.IDocumentMetier;

/**
 * Servlet implementation class ServletAjoutDocumentUtilisateur
 */
@WebServlet("/ServletAjoutDocumentUtilisateur")
public class ServletAjoutDocumentUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IDocumentMetier dao;
	public void init() {
		dao = new DocumentMetierImpl();
	}
    public ServletAjoutDocumentUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titre =request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		int nbr = Integer.parseInt((String) request.getParameter("nbr"));
		String categorie = request.getParameter("categorie");
		
		Document d = new Document (titre , auteur , nbr , categorie );
		dao.ajouterDocument(d);
		if(d.getCategorie().equals("informatique")) {
			response.sendRedirect("ServletDocumentsInfoUtilisateur");
		}
		else if(d.getCategorie().equals("genie electrique")) {
			response.sendRedirect("ServletDocumentsElecUtilisateur");
		}
		else if(d.getCategorie().equals("genie mecanique")) {
			response.sendRedirect("ServletDocumentsMecUtilisateur");
		}
		else if(d.getCategorie().equals("commerce")) {
			response.sendRedirect("ServletDocumentsComUtilisateur");
		}
		else if(d.getCategorie().equals("genie des procedes")) {
			response.sendRedirect("ServletDocumentsProcUtilisateur");
		}
		else {
			response.sendRedirect("ServletDocumentsAutreUtilisateur");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
