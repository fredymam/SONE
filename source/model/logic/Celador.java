package model.logic;
import java.util.ArrayList;
import model.logic.Curso;

public class Celador extends Persona {
	
	public ArrayList<Curso> cursos;
	public ArrayList<Alumno> alumnos;

	public Celador(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		setCorreo(correo);
		setTelefono(telefono);
		setCursos(new ArrayList<Curso>());
		setAlumnos(new ArrayList<Alumno>());
		
	}
	
	// Metodo para crear un Curso
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
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}