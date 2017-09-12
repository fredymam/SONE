package logica;

import java.util.ArrayList;

public class Curso {
	protected String Nombre;
	protected String Apellido;
	protected int DNI;
	protected int Curso;
	protected int Division;
	protected String Turno;
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
}
