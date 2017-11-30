package model.logic;
import model.logic.Curso;

public class Alumno extends Persona {
 	private Tutor tutor;
	private Curso curso;
	
	public Alumno(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}