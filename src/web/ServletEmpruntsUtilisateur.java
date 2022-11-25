package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Emprunt;
import metier.EmpruntMetierImpl;
import metier.IEmpruntMetier;

/**
 * Servlet implementation class ServletEmpruntsUtilisateur
 */
@WebServlet("/ServletEmpruntsUtilisateur")
public class ServletEmpruntsUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IEmpruntMetier dao;
	public void init() {
		dao = new EmpruntMetierImpl();
	}
    public ServletEmpruntsUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cin =Integer.parseInt(request.getParameter("cin"));
		String action2 = request.getParameter("action2");
		if(action2 !=null) {
			if(action2.equals("rechercher")) {
				int mc =Integer.parseInt((String) request.getParameter("mc"));
				List<Emprunt> liste = dao.getAllEmpruntUtilisateurByMC(mc,cin);
				request.setAttribute("emprunts" , liste);
				request.getRequestDispatcher("FindAllEmpruntsUtilisateur.jsp").forward(request , response);
			}
			else if(action2.equals("Supprimer")) {
				int id =Integer.parseInt(request.getParameter("id"));
				dao.supprimerEmprunt(id);
				
				List<Emprunt> liste = dao.getAllEmpruntUtilisateur(cin);
				request.setAttribute("emprunts" , liste);
				request.getRequestDispatcher("FindAllEmpruntsUtilisateur.jsp").forward(request , response);
			}
			
		}
		else {
			
			List <Emprunt> liste = dao.getAllEmpruntUtilisateur(cin);
			request.setAttribute("emprunts" , liste);
			request.getRequestDispatcher("FindAllEmpruntsUtilisateur.jsp").forward(request , response);
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
