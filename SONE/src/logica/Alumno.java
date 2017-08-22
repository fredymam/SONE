package logica;

public class Alumno extends Persona {
	
	protected char Nombre;	
	protected char Apellido;
	protected int Curso;
	protected String Division;
	protected String Turno;
	protected int Dni;
	
	public Alumno(){
		
	}
	
	public void CambiarCurso(Curso curso){
		this.Curso = curso;
	}
	
	public void InscribirAlumno(Curso curso){
		this.Curso = curso;
		
	}
	
	public void EliminarAlumno(Curso curso){
		this.Curso = curso;
	}
	
	public void ModificarAlumno(Curso curso){
		this.Curso = curso;
	}
		
	}

