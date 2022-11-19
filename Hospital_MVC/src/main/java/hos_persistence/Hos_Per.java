package hos_persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import hos_entity.Hospital;

public interface Hos_Per {
	public ArrayList<Hospital> display() throws ClassNotFoundException, SQLException;

	public int insert(Hospital hos) throws ClassNotFoundException, SQLException;

	public int update(Hospital hos) throws ClassNotFoundException, SQLException;

	public int delete(int id) throws ClassNotFoundException, SQLException;
	
	public Hospital id(int id) throws ClassNotFoundException, SQLException;
}
