package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDatos {
    private Connection jdbcConnection;
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private PreparedStatement Query;

    public BaseDatos(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
		this.jdbcConnection = null;
	}
    
	public Connection getConnection() {
		return jdbcConnection;
	} 
	
	public void Conectar() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } 
            catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    public void Desconectar() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }

	public PreparedStatement setSQL(String consulta) throws SQLException {
	  Query = jdbcConnection.prepareStatement(consulta);	
	  return Query;
	 }
	
	public PreparedStatement getSQL() {
		return Query;
	}
	
	public void Parametros(String[] params) throws SQLException {
		for (int i=0; i<params.length; i++) {
			Query.setString(i + 1, params[i]);
		}		
	}
	
	public boolean execute() throws SQLException {
		return Query.execute();
	}
	
	public ResultSet ExecQuery() throws SQLException {
		return Query.executeQuery();
	}
	
	public void setString(int parameterIndex, String x) throws SQLException {
		Query.setString(parameterIndex, x);
	}

	public void setInt(int parameterIndex, int x) throws SQLException {
		Query.setInt(parameterIndex, x);
	}
}
