package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Message;
import metier.IMessageMetier;
import metier.MessageMetierImpl;


/**
 * Servlet implementation class ServletMessages
 */
@WebServlet("/ServletMessages")
public class ServletMessages extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IMessageMetier dao;
	public void init() {
		dao = new MessageMetierImpl();
	}
    public ServletMessages() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
				List <Message> liste = dao.getAllMessages();
				request.setAttribute("Messages" , liste);
				request.getRequestDispatcher("FindAllMessages.jsp").forward(request , response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
