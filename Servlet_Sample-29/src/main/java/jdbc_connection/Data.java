package jdbc_connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Result;

/**
 * Servlet implementation class Student_Details
 */
@WebServlet("/Data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String dob=request.getParameter("DOB");
		String[] hob=request.getParameterValues("a4");	
		String hob1=Arrays.toString(hob);
		PrintWriter st=response.getWriter();
	    try {
	    	int i=insertDetails(id,name,course,dob,hob1);
	    	if(i!=0)
	    		st.write("<h1>Inserted Successfully</h1>");
	    	else
	    		st.write("<h1> Operation Failed</h1>");
	    }
	    catch(ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	    }
	}
	public int insertDetails(int id,String name,String course,String dob,String hob)throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark42","root","A9989975246");
		PreparedStatement st1=con.prepareStatement("insert into fsd_30 values(?,?,?,?,?)");
		st1.setInt(1,id);
		st1.setString(2,name);
		st1.setString(3,course);
		st1.setString(4,dob);
		st1.setString(5,hob);
		int i=st1.executeUpdate();
		con.close();
		return i;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int Id=Integer.parseInt(request.getParameter("id"));
		PrintWriter st=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark42","root","A9989975246");
			PreparedStatement st1=con.prepareStatement("select* from fsd_30 where id=?");
			st1.setInt(1, Id);
			ResultSet s=st1.executeQuery();
			while(s.next()) {
				st.print(" "+s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getString(4)+" "+s.getString(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}