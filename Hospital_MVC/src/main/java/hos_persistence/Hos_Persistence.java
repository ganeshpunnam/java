package hos_persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import hos_entity.Hospital;

public class Hos_Persistence implements Hos_Per {
	/*
	 * Display Total Data
	 */
	public ArrayList<Hospital> display() throws ClassNotFoundException, SQLException {
		Hospital hs = null;
		ArrayList<Hospital> arr = new ArrayList<Hospital>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps = con.prepareStatement("Select * from hospital");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			hs = new Hospital();
			hs.setId(rs.getInt(1));
			hs.setName(rs.getString(2));
			hs.setCity(rs.getString(3));
			hs.setState(rs.getString(4));
			arr.add(hs);
		}
		return arr;
	}
	/*
	 * Insert New Data
	 */
	public int insert(Hospital hos) throws ClassNotFoundException, SQLException {
		Hospital hs = null;
		ArrayList<Hospital> arr = new ArrayList<Hospital>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps = con.prepareStatement("Insert into hospital values(?,?,?,?)");
		ps.setInt(1, hos.getId());
		ps.setString(2,hos.getName());
		ps.setString(3,hos.getCity());
		ps.setString(4,hos.getState());
		int i=ps.executeUpdate();
		return i;
	}
	/*
	 * Update Data
	 */
	public int update(Hospital hos) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps = con.prepareStatement("update hospital set name=?,city=?,state=? where id=?");
		
		ps.setString(1,hos.getName());
		ps.setString(2,hos.getCity());
		ps.setString(3,hos.getState());
		ps.setInt(4,hos.getId());
		int i=ps.executeUpdate();
		return i;
	}
	/*
	 * Delete Data
	 */
	public int delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps = con.prepareStatement("delete from hospital where id=?");
		ps.setInt(1,id);
		int i=ps.executeUpdate();
		return i;
	}
	public Hospital id(int id) throws ClassNotFoundException, SQLException {
		Hospital hos=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark41","root","A9989975246");
		PreparedStatement ps = con.prepareStatement("select * from hospital where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			hos=new Hospital();
			hos.setId(rs.getInt(1));
			hos.setName(rs.getString(2));
			hos.setCity(rs.getString(3));
			hos.setState(rs.getString(4));
		}
		return hos;
	}

}
