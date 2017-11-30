package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import model.logic.Alumno;


public class AlumnoDAO {
	private BaseDatos db;	

	public AlumnoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		db = new BaseDatos(jdbcURL, jdbcUsername, jdbcPassword); 
		// declarar BaseDatos como singleton y registarla en el ServletContext 02!
	}
	
	// listar todos los alumnos
	public Map<Integer,Alumno> listarAlumnos() throws SQLException {
		Map<Integer,Alumno> listaAlumnos = new HashMap<Integer,Alumno>();
		db.Conectar();
		db.setSQL("SELECT * FROM Alumno");		
		ResultSet datos = db.ExecQuery();
		while (datos.next()) {
			String nombre = datos.getString("nombre"); 
			String apellido = datos.getString("apellido");
			int dni = datos.getInt("dni");
			Alumno alumno = new Alumno(nombre, apellido, dni);
			listaAlumnos.put(dni, alumno);
		}
		db.Desconectar();
		return listaAlumnos;
	}
	
	// buscar alumno en BD por #ID
	public Alumno buscarID(int id) throws SQLException {
		Alumno alumno = null;
		db.Conectar();
		db.setSQL("SELECT * FROM Alumno WHERE id= ?");		
		db.setInt(1, id);
		ResultSet datos = db.ExecQuery();
		if (datos.next()) {
			String nombre = datos.getString("nombre");
			String apellido = datos.getString("apellido");
			int dni = datos.getInt("dni");
			alumno = new Alumno(nombre, apellido, dni);
		}
		return alumno;
	}

	// insertar alumno
	public boolean insertar(Alumno alumno) throws SQLException {
		boolean resultado = false;
		db.Conectar();
		db.setSQL("INSERT INTO Alumno (nombre, apellido, dni) VALUES (?, ?, ?)");	
		db.setString(1, alumno.getNombre());
		db.setString(2, alumno.getApellido());	
		db.setInt(3, alumno.getDni());
		resultado = db.execute();
		db.Desconectar();
		return resultado;
	}

	// actualizar > "key" corresponde a la clave primaria(dni), que eventualmente se modifico
	public boolean actualizar(Alumno alumno, int key) throws SQLException {
		boolean resultado = false;
		db.Conectar();
		db.setSQL("UPDATE Alumno SET nombre=?, apellido=?, dni=? WHERE dni=?");	
		db.setString(1, alumno.getNombre());
		db.setString(2, alumno.getApellido());	
		db.setInt(3, alumno.getDni());
		db.setInt(4, key);
		resultado = db.execute();
		db.Desconectar();
		return resultado;
	}
	
	//eliminar > metodo sobrecargado para eliminar por dni(int) o objeto(alumno)
	public boolean eliminar(Alumno alumno) throws SQLException {
		return eliminar(alumno.getDni());
	}
	
	public boolean eliminar(int key) throws SQLException {
		boolean resultado = false;
		db.Conectar();
		db.setSQL("DELETE FROM  Alumno WHERE dni=?");	
		db.setInt(1, key);
		resultado = db.execute();
		db.Desconectar();
		return resultado;
	}

}
