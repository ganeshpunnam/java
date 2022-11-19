package jdbc_project;
import java.sql.*;
public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		Statement st=con.createStatement();
		st.executeUpdate("create table apple(id int,name varchar(20))");
	    con.close();
		
	    System.out.println("class load succsfull");	 
	}
}