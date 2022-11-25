package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Message;
import entities.Utilisateur;
import metier.IMessageMetier;
import metier.MessageMetierImpl;

/**
 * Servlet implementation class ServletEnvoyerMessage
 */
@WebServlet("/ServletEnvoyerMessage")
public class ServletEnvoyerMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IMessageMetier dao;
	public void init() {
		dao = new MessageMetierImpl();
	}
    public ServletEnvoyerMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String message = request.getParameter("message");
		Message m = new Message(nom, prenom, mail, message );
		dao.ajouterMessage(m);
		 request.setAttribute("valid", "Message envoyer avec succes !!!");
		 request.getRequestDispatcher("contact-us.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
