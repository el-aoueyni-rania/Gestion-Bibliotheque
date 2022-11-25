package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Document;
import metier.DocumentMetierImpl;
import metier.IDocumentMetier;

/**
 * Servlet implementation class ServletDocumentsCom
 */
@WebServlet("/ServletDocumentsCom")
public class ServletDocumentsCom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IDocumentMetier dao;
	public void init() {
		dao = new DocumentMetierImpl();
	}
    public ServletDocumentsCom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if(action !=null) {
			if(action.equals("rechercher")) {
				String mc = request.getParameter("mc");
				List <Document> liste = dao.getAllDocumentsComByMC(mc);
				request.setAttribute("Documents" , liste);
				request.getRequestDispatcher("DocumentsCommerce.jsp").forward(request , response);
			}
		}
		else {
		
		List <Document> liste = dao.getAllDocumentsCom();
		request.setAttribute("Documents" , liste);
		request.getRequestDispatcher("DocumentsCommerce.jsp").forward(request , response);
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
