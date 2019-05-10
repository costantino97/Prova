package it.sincrono.corso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u=request.getParameter("user");
		String messaggioDiErrore="Login errata!";
		
		RequestDispatcher d=null;
		if(u.equals("pippo")) { 
			d=request.getRequestDispatcher("views/LoginOk.jsp"); // indica il percorso
		//	d.forward(request, response); //forward lo reinderizza
		//	response.sendRedirect("views/LoginOk.jsp"); //senRedirect cambia fisicamente la pag
		}
		else {
			d=request.getRequestDispatcher("views/Login2.jsp");
			request.setAttribute("ciccio","Login errata");
			
		//	request.getRequestDispatcher("views/Error.jsp");
		//	response.sendRedirect("views/Error.jsp");
		} 
		d.forward(request, response);
		}
	}


