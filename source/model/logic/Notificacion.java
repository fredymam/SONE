package model.logic;

import java.util.ArrayList;
import java.util.Date;

public class Notificacion {
	private ArrayList<Alumno> Alumnos;
	private String Mensaje;
	private Date Fecha;
	private Date Vencimiento;
	private String Token;
	
	public Notificacion() {
		// crear un token
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		Alumnos = alumnos;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Date getVencimiento() {
		return Vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		Vencimiento = vencimiento;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public void Notificar() {
		
	}
	

}
