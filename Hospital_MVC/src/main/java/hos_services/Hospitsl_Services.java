package hos_services;

import java.sql.SQLException;
import java.util.ArrayList;
import hos_entity.Hospital;
import hos_persistence.Hos_Persistence;

public class Hospitsl_Services {
	public ArrayList<Hospital> display() throws ClassNotFoundException, SQLException {
		return new Hos_Persistence().display();
	}

	public int insert(Hospital hos) throws ClassNotFoundException, SQLException {
		return new Hos_Persistence().insert(hos);
	}

	public int update(Hospital hos) throws ClassNotFoundException, SQLException {
		return new Hos_Persistence().update(hos);
	}

	public int delete(int id) throws ClassNotFoundException, SQLException {
		return new Hos_Persistence().delete(id);
	}

	public Hospital getId(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return new Hos_Persistence().id(id);
	}
}
