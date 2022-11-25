package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import entities.Utilisateur;
import metier.IUtilisateurMetier;
import metier.UtilisateurMetierImpl;

/**
 * Servlet implementation class ServletUtilisateurs
 */
@WebServlet("/ServletUtilisateurs")
public class ServletUtilisateurs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IUtilisateurMetier dao;
	public void init() {
		dao = new UtilisateurMetierImpl();
	}
    public ServletUtilisateurs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action = request.getParameter("action");
	if(action!=null) {
		if(action.equals("rechercher")) {
			String mc = request.getParameter("mc");
			List <Utilisateur> liste = dao.getAllUtilisateursByMC(mc);
			request.setAttribute("Utilisateurs" , liste);
			request.getRequestDispatcher("FindAllUtilisateurs.jsp").forward(request , response);
		}
	}
		
		else {
			List <Utilisateur> liste = dao.getAllUtilisateurs();
			request.setAttribute("Utilisateurs" , liste);
			request.getRequestDispatcher("FindAllUtilisateurs.jsp").forward(request , response);
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
