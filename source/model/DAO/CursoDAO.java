package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import model.logic.Curso;
import model.DAO.BaseDatos;

public class CursoDAO {
	private BaseDatos db;
	
	public CursoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		db = new BaseDatos(jdbcURL, jdbcUsername, jdbcPassword);
	}
	
	// insertar curso
	public boolean insertar(Curso curso) throws SQLException {
		db.Conectar();
		db.setSQL("INSERT INTO curso (escuela, curso, division, turno, detalle) VALUES (?, ?, ?, ?, ?);");
		db.setInt(1, 1); 
		db.setInt(2, curso.getNumero_curso());
		db.setInt(3, curso.getDivision());
		db.setString(4, curso.getTurno());
		db.setString(5, "Detalle a manopla");
		boolean rowInserted = db.execute();
		db.Desconectar();
		return rowInserted;
	}
	
	// listar todos los cursos
	public Map<Integer, Curso> listarCursos() throws SQLException {
		//List<Curso> listaCursos = new ArrayList<Curso>();
		Map<Integer, Curso> listaCursos = new HashMap<Integer, Curso>();
		db.Conectar();
		db.setSQL("SELECT * FROM curso");
		ResultSet resultSet = db.ExecQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			int numero_curso = resultSet.getInt("curso");
			int division = resultSet.getInt("division");
			String turno = resultSet.getString("turno");
			Curso curso = new Curso(numero_curso, division, turno);
			listaCursos.put(id, curso);
		}
		db.Desconectar();
		return listaCursos;
	}
		
	// obtener por id
	public Curso obtenerPorId(int id) throws SQLException {
		Curso curso = null;
		db.Conectar();
		db.setSQL("SELECT * FROM curso WHERE id = ?");
		db.setInt(1, id);
		ResultSet resultSet = db.ExecQuery();
		if (resultSet.next()) {
			int numero_curso = resultSet.getInt("curso");
			int division = resultSet.getInt("division");
			String turno = resultSet.getString("turno");
			curso = new Curso(numero_curso, division, turno);
		}
		db.Desconectar();
		return curso;
	}

	// actualizar
	public ResultSet actualizar(int id, Curso curso) throws SQLException {
		db.Conectar();
		db.setSQL("UPDATE curso SET curso = ?, division = ?, turno = ? WHERE id = ?;");
		db.setInt(1, curso.getNumero_curso());
		db.setInt(2, curso.getDivision());
		db.setString(3, curso.getTurno());
		db.setInt(4, id);
		ResultSet result = db.ExecQuery();
		System.out.println("llego2");
		db.Desconectar();
		return result;
	}
	
	//eliminar
	public boolean eliminar(Curso curso) throws SQLException {
		System.out.println("llego1");
		boolean rowEliminar = false;
		db.Conectar();
		db.setSQL("DELETE FROM curso WHERE numero_curso = ?");
		db.setInt(1, curso.getNumero_curso());
		System.out.println("llego2");
		rowEliminar = db.execute();
		System.out.println("llego3");
		db.Desconectar();
		return rowEliminar;
	}
}
