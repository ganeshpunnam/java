package project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Third_sample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select * from apple");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		}
		con.close();
	}
}
