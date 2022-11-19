package hos_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hos_entity.Hospital;
import hos_services.Hospitsl_Services;

/**
 * Servlet implementation class Hospital_Control
 */
@WebServlet("/Hospital_Control")
public class Hospital_Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hospital_Control() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<Hospital> hosList = new Hospitsl_Services().display();
			request.setAttribute("allhospitals", hosList);
			RequestDispatcher rd = request.getRequestDispatcher("Hos_Main.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String RequestType = request.getParameter("Request");
		PrintWriter out = response.getWriter();
		if (RequestType.equalsIgnoreCase("addlist")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String city = request.getParameter("city");
				String state = request.getParameter("state");
				Hospital hos = new Hospital();
				hos.setId(id);
				hos.setName(name);
				hos.setCity(city);
				hos.setState(state);
				int i = new Hospitsl_Services().insert(hos);
				if (i != 0)
					doGet(request, response); // display logic
				else
					out.write("<h2>Insertion Failed</h2>");

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (RequestType.equalsIgnoreCase("Update")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				Hospital hos = new Hospitsl_Services().getId(id);
				request.setAttribute("hosl", hos);
				RequestDispatcher rd = request.getRequestDispatcher("EditList.jsp");
				rd.include(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (RequestType.equalsIgnoreCase("Edit")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String city = request.getParameter("city");
				String state = request.getParameter("state");
				Hospital hos = new Hospital(id,name,city,state);
				int i = new Hospitsl_Services().update(hos);
				if (i != 0)
					doGet(request, response);
				else
					out.write("<h2>Updation Failed</h2>");

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (RequestType.equalsIgnoreCase("Delete")) {

			try {
				int id = Integer.parseInt(request.getParameter("id"));
				int i = new Hospitsl_Services().delete(id);
				if (i != 0)
					doGet(request, response); // display logic
				else
					out.write("<h2>Deletion Failed</h2>");

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
