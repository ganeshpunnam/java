package request_dispatch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Request_dispatch
 */
@WebServlet("/Request_dispatch")
public class Request_dispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request_dispatch() {
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
		// doGet(request, response);
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("Id"));
		PrintWriter out=response.getWriter();
		 
		try {
			String name=check(id);
			HttpSession sesstion=request.getSession(true);
			sesstion.setAttribute("NAME", "name");
				if(name.contains("S")) {
					RequestDispatcher rd=request.getRequestDispatcher("Agrade");
					rd.forward(request, response);
				}else  {//if(name.contains("A"))
					RequestDispatcher rd=request.getRequestDispatcher("Bgrade");
					rd.forward(request, response);
				}
				//else{
					//out.write("<h1 style='font-size: xx-large ;'> No Data Found </h1>");
			//}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String check(int id) throws SQLException, ClassNotFoundException {
		String name="";	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark42","root","A9989975246");
		PreparedStatement ps=con.prepareStatement("select* from fsd_30 where Id=?");
		ps.setInt(1,id);
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			name=rs.getString(2);
		}con.close();
		return name;
	}
}
