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

import model.DAO.EscuelaDAO;
import model.logic.Escuela;

@WebServlet("/EscuelaServlet")
public class EscuelaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EscuelaDAO escuelaDAO;
	
	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		try {
			escuelaDAO = new EscuelaDAO(jdbcURL, jdbcUsername, jdbcPassword);
		} 
		catch (Exception e) {
		}
	}

	public EscuelaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "index":
				index(request, response);
				break;
			case "nuevo":
				nuevo(request, response);
				break;
			case "registrar":
				registrar(request, response);
				break;
			case "mostrar":
				mostrar (request, response);
				break;
			case "mostrarEditar":
				mostrarEditar(request, response);
				break;	
			case "editar":
				editar(request, response);
				break;
			case "eliminar":
				eliminar(request, response);
				break;
			default:
				break;
			}			
		} catch (SQLException e) {
			e.getStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int cue = Integer.parseInt(request.getParameter("cue"));
		String nombre_escuela = request.getParameter("nombre_escuela");
		Escuela escuela = new Escuela(cue, nombre_escuela);
		escuelaDAO.insertar(escuela);

		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/escuela/registrar.jsp");
		dispatcher.forward(request, response);
	}
	
	
	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/escuela/mostrar.jsp");
		List<Escuela> listaEscuelas= escuelaDAO.listarEscuelas();
		request.setAttribute("lista", listaEscuelas);
		dispatcher.forward(request, response);
	}	
	
		private void mostrarEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Escuela escuela = escuelaDAO.obtenerPorId(Integer.parseInt(request.getParameter("cue")));
		request.setAttribute("escuela", escuela);
		//request.setAttribute("id", escuela);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/escuela/editar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		int cue = Integer.parseInt(request.getParameter("cue"));
		String nombre_escuela = request.getParameter("nombre_escuela");
		int id = Integer.parseInt(request.getParameter("cue_old"));
		Escuela escuela = new Escuela(cue, nombre_escuela);
		escuelaDAO.actualizar(id, escuela);
		index(request, response);
	}
	
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		int cue=Integer.parseInt(request.getParameter("cue"));
		Escuela escuela = escuelaDAO.obtenerPorId(cue);
		escuelaDAO.eliminar(escuela);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}
}
