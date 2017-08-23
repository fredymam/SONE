package logica;

public class Alumno extends Persona {
 
	public Tutor tutor;
	public Curso curso;
	
	public Alumno(String nombre, String apellido, int dni, Curso curso) {
		super(nombre, apellido, dni);
		this.curso = curso;
	}

}

