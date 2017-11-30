package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

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
		doGet(request, response);
		
	}
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/register.jsp");
		dispatcher.forward(request, response);
	}
	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		int dni = Integer.parseInt(request.getParameter("dni"));		
		Alumno alumno = new Alumno(nombre,apellido,dni);
		alumnoDAO.insertar(alumno);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/alumno/mostrar.jsp");
		Map<Integer,Alumno> listarAlumnos = alumnoDAO.listarAlumnos();
		request.setAttribute("lista", listarAlumnos);
		dispatcher.forward(request, response);
	}	
}
