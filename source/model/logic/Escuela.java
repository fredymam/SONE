package model.logic;
import java.util.ArrayList;

public class Escuela {
	public static ArrayList<Curso> cursos;
	public ArrayList<Alumno> alumnos; 
	public int cue;
	public String nombre_escuela;
	
	public Escuela(int cue, String nombre_escuela){
		this.cue = cue;
		this.nombre_escuela = nombre_escuela;
	}
	
	public int getCue() {
		return cue;
	}
	
	public String getNombre_escuela() {
		return nombre_escuela;
	}
	
	public static void crearCurso(int numero_curso, int division, String turno){
		Curso curso = new Curso(numero_curso, division, turno);
		cursoAlta(curso);
	}
	
	public void crearAlumno(String nombre, String apellido, int dni, Curso curso){
		Alumno alumno = new Alumno(nombre, apellido, dni, curso);
		alumnoAlta(alumno);
	}
	
	public static void cursoAlta(Curso curso){
		cursos.add(curso);
	}
	
	public void alumnoAlta(Alumno alumno){
		alumnos.add(alumno);
	}
	
	public static Curso buscarCurso(int numero, int division){
		Curso resultado = null;
		for(Curso curso : cursos){
			if(curso.numero_curso == numero && curso.division == division){
			    resultado = curso;
				break;
			}
		}
		return resultado;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}
}