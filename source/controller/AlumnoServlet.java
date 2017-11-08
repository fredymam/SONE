package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AlumnoDAO;
import model.logic.Alumno;


@WebServlet("/AlumnoServlet")
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AlumnoDAO alumnoDAO;
       
    public void init() {
		System.out.println("init");
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
   		try {
   			alumnoDAO = new AlumnoDAO(jdbcURL, jdbcUsername, jdbcPassword);
   		} catch (SQLException e) {
			e.getStackTrace();
		}
	
   	}
   
    public AlumnoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "index":
				//index(request, response);
				break;
			case "nuevo":
				nuevo(request, response);
				break;
			case "registrar":
				registrar(request, response);
				break;
			case "mostrar":
				mostrar(request, response);
				break;
			default:
				break;
			}			
		} catch (SQLException e) {
			e.getStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/register.jsp");
		dispatcher.forward(request, response);
	}
	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Alumno alumno = new Alumno(request.getParameter("nombre"), request.getParameter("apellido"), 1);
		alumnoDAO.insertar(alumno);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrar.jsp");
		List<Alumno> listarAlumnos= alumnoDAO.listarAlumnos();
		System.out.println("aca funca");
		request.setAttribute("lista", listarAlumnos);
		dispatcher.forward(request, response);
	}	
}
