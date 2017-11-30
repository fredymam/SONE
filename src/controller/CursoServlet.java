package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.CursoDAO;
import model.logic.Curso;
import model.logic.NotificacionMAIL;

@WebServlet("/CursoServlet")
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CursoDAO cursoDao;
       
    public CursoServlet() {
        super();
    }

    public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		try {
			cursoDao = new CursoDAO(jdbcURL, jdbcUsername, jdbcPassword);
		} 
		catch (Exception e) {
		}
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
			case "register":
				registrar(request, response);
				break;
			case "mostrar":
				mostrar(request, response);
				break;
			case "showedit":
				showEditar(request, response);
				break;	
			case "editar":
				editar(request, response);
				break;
			case "eliminar":
				eliminar(request, response);
				break;
			case "notificar":
				notificar(request, response);
				break;
			default:
				break;
			}			
		} 
		catch (SQLException e) {
			e.getStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/curso/register.jsp");
		dispatcher.forward(request, response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int numero_curso = Integer.parseInt(request.getParameter("curso"));
		int division = Integer.parseInt(request.getParameter("division"));
		String turno = request.getParameter("turno");
		
		Curso curso = new Curso(numero_curso, division, turno);
		cursoDao.insertar(curso);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/curso/mostrar.jsp");
		Map<Integer, Curso> listaCursos = cursoDao.listarCursos();
		request.setAttribute("cursos", listaCursos);
		dispatcher.forward(request, response);
	}
	
	private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Curso curso = cursoDao.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("curso", curso);
		request.setAttribute("id", Integer.parseInt(request.getParameter("id")));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/curso/editar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		int numero_curso = Integer.parseInt(request.getParameter("numero_curso"));
		int division = Integer.parseInt(request.getParameter("division"));
		String turno = request.getParameter("turno");
		int id = Integer.parseInt(request.getParameter("id"));
		Curso curso = new Curso(numero_curso, division, turno);
		cursoDao.actualizar(id, curso);
		mostrar(request, response);
	}
	
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		Curso curso = cursoDao.obtenerPorId(Integer.parseInt(request.getParameter("curso")));
		cursoDao.eliminar(curso);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/curso/mostrar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void notificar(HttpServletRequest request, HttpServletResponse response) {
	    //agregar control de parametros nulos
		NotificacionMAIL notificar = new NotificacionMAIL(); // hint: usar interface
		SimpleDateFormat parseFecha = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		try {
		  notificar.setFecha(parseFecha.parse(request.getParameter("fecha")));		    
		} catch (ParseException e) { e.printStackTrace(); }	
		notificar.setMensaje(request.getParameter("mensaje"));
	//	notificar.setVencimiento();
	//	notificar.setAlumnos(alumnos);
		notificar.Notificar();
	//  redireccionar a una pagina	
	}
}
