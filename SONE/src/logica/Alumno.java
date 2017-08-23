package logica;

public class Alumno extends Persona {
	
	protected int Curso;
	protected String Division;
	protected String Turno;
	protected int Dni;
	
	public Alumno(){
		
	}
	
	public void CambiarCurso(int curso){
		this.Curso = curso;
	}
	
	public void InscribirAlumno(int curso){
		this.Curso = curso;
		
	}
	
	public void EliminarAlumno(int curso){
		this.Curso = curso;
	}
	
	public void ModificarAlumno(int curso){
		this.Curso = curso;
	}
		
}

