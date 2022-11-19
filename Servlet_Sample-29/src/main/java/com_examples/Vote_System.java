package com_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;

/**
 * Servlet implementation class Vote_System
 */
@WebServlet("/Vote_System")
public class Vote_System extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vote_System() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	System.out.println("enter the name");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println("enter the age");
	int n=sc.nextInt();
	if(n>=18) {
		out.write("<h1>"+n+"Your are Elgible for vote"+"</h1>");
	}
	else {
		out.write("<h1>"+n+"Your are not Elgible  vote,You are Elgible After"+(18-n)+"</h1>");
		
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
