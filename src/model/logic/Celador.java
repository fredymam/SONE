package model.logic;
import java.util.ArrayList;
import model.logic.Curso;

public class Celador extends Persona {	
	public ArrayList<Curso> cursos;
	public ArrayList<Alumno> alumnos;

	public Celador(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		cursos = new ArrayList<Curso>();
		alumnos = new ArrayList<Alumno>();		
	}
	
	// crear un Curso
	public void crearCurso(int numero_curso, int division, String turno){
		Curso curso = new Curso(numero_curso, division, turno);
		cursoAlta(curso);
	}
	
	public void cursoAlta(Curso curso){
		cursos.add(curso);
	}
	
	public void cursoBaja(Curso curso) {
		/* 
		 * Dos objetos con los mismos atributos, no son necesariamente iguales; 
		 * debido a que "eventualmente" apuntan a distintas direcciones de memoria.
		 * >> cursos.remove(curso) o cursos.indexOf(curso)
		 *  
		 */
		Curso copia = buscarCurso(curso.getNumero_curso(),curso.getDivision(),curso.getTurno());
		if (copia != null) {
			cursos.remove(copia);
		};
	}
	
	public Curso buscarCurso(int numero, int division, String turno){
		Curso resultado = null;
		for(Curso curso : cursos){
			if(curso.numero_curso == numero && curso.division == division && curso.getTurno().equalsIgnoreCase("turno")){
			    resultado = curso;
				break;
			}
		}
		return resultado;
	}
	
	public void crearAlumno(String nombre, String apellido, int dni, Curso curso){
		Alumno alumno = new Alumno(nombre, apellido, dni);
		alumno.setCurso(curso);
		alumnoAlta(alumno);
	}
	
	public void alumnoAlta(Alumno alumno){
		alumnos.add(alumno);
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