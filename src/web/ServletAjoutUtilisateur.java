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
 * Servlet implementation class ServletAjoutUtilisateur
 */
@WebServlet("/ServletAjoutUtilisateur")
public class ServletAjoutUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	IUtilisateurMetier dao;
	public void init() {
		dao = new UtilisateurMetierImpl();
	}
	
	
	
    public ServletAjoutUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
				int cin = Integer.parseInt((String)request.getParameter("cin"));
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String genre = request.getParameter("genre");
				int tel = Integer.parseInt((String)request.getParameter("tel"));
				String adresse = request.getParameter("adresse");
				String date = request.getParameter("date");
				String mail = request.getParameter("mail");
				String pwd = request.getParameter("password");
				String role = request.getParameter("role");
				
				Utilisateur u = new Utilisateur(cin, nom, prenom, genre, tel, adresse, date, mail, pwd, role );
				dao.ajouterUtilisateur(u);
				response.sendRedirect("login.jsp");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
