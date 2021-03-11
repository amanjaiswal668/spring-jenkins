package com.zensar.servlet_jsp_mvn_jenkins_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Printing in the console");

		String user = request.getParameter("uname");
		String password = request.getParameter("password");

		if (user.equals("Tim") && password.equals("Tim@123")) {

			response.getWriter().print("<h2>### Valid User using webhooks on port 7070 ###</h2>");
			response.getWriter().print("<h2>Triggering automatic build in jenkins using webhooks!!!</h2>");
		} else {
			response.getWriter().print("<h2>InValid User!!!</h2>");
		}
	}

}
