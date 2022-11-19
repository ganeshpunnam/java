package com_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Servlet implementation class Frist_Sample
 */
@WebServlet("/Frist_Sample")
public class Frist_Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Frist_Sample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String org="Wipro";
	Calendar cal = (Calendar) Calendar.getInstance();
	PrintWriter out=response.getWriter();
	out.write("<html><head><title>wipro</title></head>");
	out.write("<body style= 'background-color:pink'>"
			+"<h1 style = 'color:blue;text-align:center'>"
			+"Welcome to"+org+"</h1>"+"<p>"+cal.getTime()+"</p>");
	out.write("<p>"+cal.getTimeInMillis()+"</p>"+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
