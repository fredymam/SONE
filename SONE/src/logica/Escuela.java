package logica;

import java.util.ArrayList;

public class Escuela {

	public ArrayList<Curso> cursos;
	public ArrayList<Alumno> alumnos; 
	
	
	public void crearCurso(int numero_curso, int division, String turno){
		Curso curso = new Curso(numero_curso, division, turno);
		cursoAlta(curso);
	}
	
	public void crearAlumno(String nombre, String apellido, int dni, Curso curso){
		Alumno alumno = new Alumno(nombre, apellido, dni, curso);
		alumnoAlta(alumno);
	}
	
	public void cursoAlta(Curso curso){
		cursos.add(curso);
	}
	
	public void alumnoAlta(Alumno alumno){
		alumnos.add(alumno);
	}
	
	public Curso buscarCurso(int numero, int division){
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
