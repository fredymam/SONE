package logica;

import java.util.ArrayList;

public class Curso {
	protected String Nombre;
	protected String Apellido;
	protected int DNI;
	protected int Curso;
	protected int Division;
	protected int Año;
	protected char Turno;
	protected ArrayList<Alumno> ListaAlumnos;
	
	public Curso(int Curso, int Division) {
		this.Curso = Curso;
		this.Division = Division;
		ListaAlumnos = new ArrayList<Alumno>();
		
	}
	public Alumno AgregarAlumno(int DNI, String Nombre, String Apellido){
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.DNI = DNI;
		ListaAlumnos.add(new Alumno());
		ListaAlumnos.add(new Alumno());
		return null;
	}
	
	public void Notificar(double FechaHora, String Mensaje){
		
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getCurso() {
		return Curso;
	}
	public void setCurso(int curso) {
		Curso = curso;
	}
	public int getDivision() {
		return Division;
	}
	public void setDivision(int division) {
		Division = division;
	}
	public char getTurno() {
		return Turno;
	}
	public void setTurno(char turno) {
		Turno = turno;
	}
	public void setAño(int año) {
		Año = año;
	}
	public int getAño() {
		return Año;
	}
}
