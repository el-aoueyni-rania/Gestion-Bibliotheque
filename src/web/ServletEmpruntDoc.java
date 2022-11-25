package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Emprunt;
import entities.Utilisateur;
import metier.EmpruntMetierImpl;
import metier.IEmpruntMetier;

/**
 * Servlet implementation class ServletEmpruntDoc
 */
@WebServlet("/ServletEmpruntDoc")
public class ServletEmpruntDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	IEmpruntMetier dao;
	public void init() {
		dao = new EmpruntMetierImpl();
	}
    public ServletEmpruntDoc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		    int cin_e = Integer.parseInt((String)request.getParameter("cin_e")); 
			String nom_e = request.getParameter("nom_e");
			String prenom_e = request.getParameter("prenom_e");
			String titre_doc = request.getParameter("titre_doc");
			String date_emprunt = request.getParameter("date_emprunt");

			
			Emprunt e1 = new Emprunt(cin_e, nom_e, prenom_e, titre_doc, date_emprunt );
			dao.ajouterEmprunt(e1);
			response.sendRedirect("ServletEmprunts");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
