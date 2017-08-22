package logica;

import java.util.ArrayList;

public class Curso {
	protected int Curso;
	protected int Division;
	protected char Turno;
	protected ArrayList<Alumno> ListaAlumnos;
	protected Curso() {
		ListaAlumnos = new ArrayList<Alumno>();
		ListaAlumnos.add(new Alumno());
		ListaAlumnos.add(new Alumno());
		ListaAlumnos.add(new Alumno());
	}
	
	
	
}
