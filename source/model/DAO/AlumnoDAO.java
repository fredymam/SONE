package model.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.logic.Alumno;


public class AlumnoDAO {
	private BaseDatos db;
	

	public AlumnoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		db = new BaseDatos(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar artículo
	public boolean insertar(Alumno alumno) throws SQLException {
		db.Conectar();
		db.setSQL("INSERT INTO Alumno (nombre, apellido) VALUES (?, ?)");	
		db.setString(1, alumno.getNombre());
		db.setString(2, alumno.getApellido());	
		boolean rowInserted = db.execute();
		db.Desconectar();
		return rowInserted;
	}

	// listar todos los productos
	public List<Alumno> listarAlumnos() throws SQLException {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		db.Conectar();
		db.setSQL("SELECT * FROM Alumno");		
		ResultSet datos = db.ExecQuery();
		while (datos.next()) {
			String nombre = datos.getString("nombre");
			String apellido = datos.getString("apellido");
			Alumno alumno = new Alumno(nombre, apellido, 1);
			listaAlumnos.add(alumno);
		}
		db.Desconectar();
		return listaAlumnos;
	}

	/*// obtener por id
	public Articulo obtenerPorId(int id) throws SQLException {
		Articulo articulo = null;

		String sql = "SELECT * FROM articulos WHERE id= ? ";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet res = statement.executeQuery();
		if (res.next()) {
			articulo = new Articulo(res.getInt("id"), res.getString("codigo"), res.getString("nombre"),
					res.getString("descripcion"), res.getDouble("existencia"), res.getDouble("precio"));
		}
		res.close();
		con.desconectar();

		return articulo;
	}

	// actualizar
	public boolean actualizar(Articulo articulo) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE articulos SET codigo=?,nombre=?,descripcion=?,existencia=?, precio=? WHERE id=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, articulo.getCodigo());
		statement.setString(2, articulo.getNombre());
		statement.setString(3, articulo.getDescripcion());
		statement.setDouble(4, articulo.getExistencia());
		System.out.println(articulo.getPrecio());
		statement.setDouble(5, articulo.getPrecio());
		statement.setInt(6, articulo.getId());

		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}
	
	//eliminar
	public boolean eliminar(Articulo articulo) throws SQLException {
		boolean rowEliminar = false;
		String sql = "DELETE FROM articulos WHERE ID=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, articulo.getId());

		rowEliminar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();

		return rowEliminar;
	}*/

}
