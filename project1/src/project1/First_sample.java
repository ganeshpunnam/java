package project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class First_sample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	//1)Loading the Driver
	//Syntax: Class.forName("Drivername");
	Class.forName("com.mysql.cj.jdbc.Driver");
	//2)Creating a connection(java--mysql)
	//Syntax: Connection ref_variable=DriverManager.getConnection("url","un","pwd");
    Connection con=DriverManager.getConnection(
    		"jdbc:mysql://localhost:3306/mark41","root","A9989975246"); 
	//3)preparing the query
	//-->PreparedSatement(inputs from user)
	//-->Statement(no inputs from user end)
    Statement stmt=con.createStatement();  
	//4)executing the query
	//--->executeQuery()-->select 
	//--->executeUpdate()--->non-select
    stmt.executeUpdate("create table student19(id int,name varchar(20))");
	//5)closing the connection
	//Syntax: refe_vaariable.close()
    
    con.close();
	}

}
