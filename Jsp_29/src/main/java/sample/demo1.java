package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class demo1
 */
@WebServlet("/demo1")
public class demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo1() {
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
		//doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		String sname=request.getParameter("sname");
		String utype=request.getParameter("drop");
		request.setAttribute("sname",sname);
 	   request.setAttribute("id",id);
		HttpSession s=request.getSession(true);

		s.setAttribute("sname","sname");
 	  PrintWriter out=response.getWriter();
        if(utype.equals("Male")) {
				
        	RequestDispatcher  rd=request.getRequestDispatcher("male.jsp");
				rd.forward(request, response);
			}else { //if(utype.contains("Female")){
				
				RequestDispatcher rd=request.getRequestDispatcher("female.jsp");
				rd.include(request, response);
			//}
//			else {
//				out.write("error");
		}
        }
        
	}


