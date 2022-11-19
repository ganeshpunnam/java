package request_dispatch;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jsp
 */
@WebServlet("/jsp")
public class jsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jsp() {
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
		String name=request.getParameter("sname");
		String utype=request.getParameter("drop");
		request.setAttribute("name",name);
 	   request.setAttribute("name",id);
			
        
        if(utype.equals("admin")) {
				
        	RequestDispatcher  rd=request.getRequestDispatcher("Demo.jsp");
				rd.forward(request, response);
			}else  {
				RequestDispatcher rd=request.getRequestDispatcher("Customer.jsp");
				rd.forward(request, response);
			}
        }
        
	}


