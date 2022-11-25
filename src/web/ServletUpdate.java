package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Utilisateur;
import metier.IUtilisateurMetier;
import metier.UtilisateurMetierImpl;

/**
 * Servlet implementation class ServletUpdate
 */
@WebServlet("/ServletUpdate")
public class ServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IUtilisateurMetier dao;
	public void init() {
		dao = new UtilisateurMetierImpl();
	}
    public ServletUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
		 
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		  int cin = Integer.parseInt((String)request.getParameter("cin")); 
		  String nom =request.getParameter("nom"); 
		  String prenom = request.getParameter("prenom");
		  String genre = request.getParameter("genre");
		  int tel = Integer.parseInt((String)request.getParameter("tel")); 
		  String adresse = request.getParameter("adresse"); 
		  String date = request.getParameter("date"); 
		  String mail = request.getParameter("mail");
		  String pwd = request.getParameter("pwd");
		  String role = request.getParameter("role");
		  
		  Utilisateur u = new Utilisateur(cin, nom, prenom, genre, tel, adresse, date, mail, pwd, role );
		  dao.modifierUtilisateur(u,cin); 
		  request.setAttribute("utilisateur", u);
		  request.getSession().setAttribute("utilisateur", u);
		  request.getRequestDispatcher("profil.jsp").forward(request, response);
		
		
	}

}
