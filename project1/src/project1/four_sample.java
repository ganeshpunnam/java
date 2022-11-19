package project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class four_sample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("enter id here");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps=con.prepareStatement("delete from student19  where id=?");
		ps.setInt(1,id);
		ps.executeUpdate();
		con.close();
	}
	
}
