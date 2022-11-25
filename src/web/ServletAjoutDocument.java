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
 * Servlet implementation class ServletAjoutDocument
 */
@WebServlet("/ServletAjoutDocument")
public class ServletAjoutDocument extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
	IDocumentMetier dao;
	public void init() {
		dao = new DocumentMetierImpl();
	}
	
	
    public ServletAjoutDocument() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String titre =request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		int nbr = Integer.parseInt((String) request.getParameter("nbr"));
		String categorie = request.getParameter("categorie");
		
		Document d = new Document (titre , auteur , nbr , categorie );
		dao.ajouterDocument(d);
		if(d.getCategorie().equals("informatique")) {
			response.sendRedirect("ServletDocumentsInfo");
		}
		else if(d.getCategorie().equals("genie electrique")) {
			response.sendRedirect("ServletDocumentsElec");
		}
		else if(d.getCategorie().equals("genie mecanique")) {
			response.sendRedirect("ServletDocumentsMec");
		}
		else if(d.getCategorie().equals("commerce")) {
			response.sendRedirect("ServletDocumentsCom");
		}
		else if(d.getCategorie().equals("genie des procedes")) {
			response.sendRedirect("ServletDocumentsProc");
		}
		else {
			response.sendRedirect("ServletDocumentsAutre");
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
