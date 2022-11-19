package com_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ContinueStatement;

/**
 * Servlet implementation class Range_check
 */
@WebServlet("/Range_check")
public class Range_check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Range_check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int Range1=Integer.parseInt(request.getParameter("a1"));
		int Range2=Integer.parseInt(request.getParameter("a2"));
		int temp=0;
		PrintWriter out=response.getWriter();
		out.write("<html><body>");
		for(int i=Range1;i<=Range2;i++) {
			if(i==1||i==0) 
				continue;
			temp=1;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) { 
					temp=0;
					break;
				}
			
			}
				
			
			
			if(temp==1) 
				out.write("<span>"+i+"</span>");
			
			
			
		}
		
		out.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("a1"));
		int n2=Integer.parseInt(request.getParameter("a2"));
		out.write("<html><body>");
		String primeNo = "";
		int j;
		int LastPrime = 1;
		
		
		
		
		
		for (int i = n1; i < n2; i++) {
			for (j = 2; j < i; j++) {
			   if (i % j == 0) {
			   break;
			   }
			}
			if (i == j) {
			   primeNo += i + " ";
			   if ((i - LastPrime) == 2) {
				   out.write("("+(i-2)+","+i+")");
			   }
			   LastPrime = i;
			}
			
		}
		//out.write("Prime Numbers are: " + primeNo);
	
		out.write("</html></body>");
		
	}

    
	}
	


