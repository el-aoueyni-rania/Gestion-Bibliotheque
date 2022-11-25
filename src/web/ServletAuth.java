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
 * Servlet implementation class ServletAuth
 */
@WebServlet("/ServletAuth")
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IUtilisateurMetier utilisateur= new UtilisateurMetierImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail = request.getParameter("mail");
		String pwd = request.getParameter("pwd");
		Utilisateur u=utilisateur.find(mail,pwd);
		String admin = "admin";
		if (u != null) {
			if(u.getRole().equals(admin)) {
				request.getSession().setAttribute("utilisateur", u);
				response.sendRedirect("index.jsp");
			}
			else
			{
				request.getSession().setAttribute("utilisateur", u);
				response.sendRedirect("indexutilisateur.jsp");
			}
			
	} else {
	    request.setAttribute("error", "Unknown login, try again"); // Set error msg for ${error}
	    request.getRequestDispatcher("login.jsp").forward(request, response); // Go back to login page.
	}
	}
}
