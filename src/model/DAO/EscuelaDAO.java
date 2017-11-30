package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.logic.Escuela;
import model.DAO.BaseDatos;

public class EscuelaDAO {
	private BaseDatos db;

	public EscuelaDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		db = new BaseDatos(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar escuela
	public boolean insertar(Escuela escuela) throws SQLException {
		db.Conectar();
		db.setSQL("INSERT INTO escuela (cue, nombre_escuela) VALUES (?, ?)");
		db.setInt(1, escuela.getCue());
		db.setString(2, escuela.getNombre_escuela());
		boolean rowInserted = db.execute();
		db.Desconectar();
		return rowInserted;
	}

	// listar escuelas
	public List<Escuela> listarEscuelas() throws SQLException {
		List<Escuela> listaEscuelas = new ArrayList<Escuela>();
		db.Conectar();
		db.setSQL("SELECT * FROM escuela");
		ResultSet resulSet = db.ExecQuery();
		while (resulSet.next()) {
			int cue = resulSet.getInt("cue");
			String nombre_escuela = resulSet.getString("nombre_escuela");
			Escuela escuela = new Escuela(cue, nombre_escuela);
			listaEscuelas.add(escuela);
		}
		db.Desconectar();
		return listaEscuelas;
	}


	

	// obtener por id
	public Escuela obtenerPorId(int cue) throws SQLException {
		Escuela escuela = null;
		db.Conectar();
		db.setSQL("SELECT * FROM escuela WHERE cue= ? ") ;
		db.setInt(1, cue);
		
		ResultSet res = db.ExecQuery();
		if (res.next()) {
			escuela = new Escuela(res.getInt("cue"), res.getString("nombre_escuela"));
		}
		res.close();
		db.Desconectar();

		return escuela;
	}

	// actualizar
	public boolean actualizar(int id, Escuela escuela) throws SQLException {
		boolean rowActualizar = false;
		db.Conectar();
		
		db.setSQL("UPDATE escuela SET cue = ?, nombre_escuela = ? WHERE cue = ?") ;
		
		db.setInt(1, escuela.getCue());

		db.setString(2, escuela.getNombre_escuela());
		
		db.setInt(3, id);

		rowActualizar = db.execute();
		
		db.Desconectar();
		return rowActualizar;
	}

	 //eliminar
	public boolean eliminar(Escuela escuela) throws SQLException {
		boolean rowEliminar = false;
		db.Conectar();
		db.setSQL("DELETE FROM escuela WHERE cue=?");
		db.setInt(1, escuela.getCue());

		rowEliminar = db.execute();
		db.Desconectar();

		return rowEliminar;
	}
	}


