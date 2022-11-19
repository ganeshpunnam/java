
package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Jdbc2 {
	public static void main(String[] args) {
		System.out.println("enter id and name");
	     Scanner sc=new Scanner(System.in);
	     int id=sc.nextInt();
	     String name=sc.nextLine();
	     try {
				insertion(id,name);
				} catch (Exception e) {
				e.printStackTrace();
		     } 
		}
		public static void insertion(int id, String name) throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
			PreparedStatement ps=con.prepareStatement("insert into apple values(?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			int r=ps.executeUpdate(); //operation success-->1     operation Failed--->0	
			if(r==0)
				System.out.println("Not Inserted");
			else
				System.out.println("Inserted");
		}
}
