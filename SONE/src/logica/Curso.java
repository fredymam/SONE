package logica;

import java.util.ArrayList;

public class Curso {
	protected int Curso;
	protected String Division;
	protected String Turno;
	protected ArrayList<Alumno> ListaAlumnos;
	public Curso() {
		
		ListaAlumnos = new ArrayList<Alumno>();
		
	}
	public Alumno AgregarAlumno(){
		
	
		ListaAlumnos.add(new Alumno());
		ListaAlumnos.add(new Alumno());
	}
	
	
}
