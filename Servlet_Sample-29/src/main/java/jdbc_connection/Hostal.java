package jdbc_connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

/**
 * Servlet implementation class Hostal
 */
@WebServlet("/Hostal")
public class Hostal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hostal() {
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
     String name=(request.getParameter("name"));
     
     String mon=(request.getParameter("mon"));
     String tue=(request.getParameter("tue"));
     String wed=(request.getParameter("wed"));
     String thu=(request.getParameter("thu"));
     String fri=(request.getParameter("fri"));
     String sat=(request.getParameter("sat"));
     String sun=(request.getParameter("sun"));
     PrintWriter pt=response.getWriter();
     try {
		int i=addDtails(id,name,mon,tue,wed,thu,fri,sat,sun);
		if(i!=0) {
			pt.write("<h1>Added</h1>");
		}
		else {
			pt.write("<h1>not added</h1>");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}

	public int addDtails(int id,String name,  String mon, String tue, String wed, String thu, String fri, String sat,
			String sun) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark42","root","A9989975246");
		PreparedStatement st=con.prepareStatement("insert into hostal1 values (?,?,?,?,?,?,?,?,?)");
		st.setInt(1, id);
		st.setString(2, name);
		
		st.setString(3, mon);
		st.setString(4, tue);
		st.setString(5, wed);
		st.setString(6, thu);
		st.setString(7, fri);
		st.setString(8, sat);
		st.setString(9, sun);
		int i=st.executeUpdate();
		con.close();
		return i;
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int Id=Integer.parseInt(request.getParameter("HostalId"));
		PrintWriter st=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark42","root","A9989975246");
			PreparedStatement st1=con.prepareStatement("select* from hostal1 where HostalId=?");
			st1.setInt(1, Id);
			ResultSet s=st1.executeQuery();
			while(s.next()) {
				st.print(" "+s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getString(4)+" "+s.getString(5)+" "+s.getString(6)+" "+s.getString(7)+" "+s.getString(8)+" "+s.getString(9));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
