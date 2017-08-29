package logica;

public class Celador {
	
	
	protected String Nombre;
	protected String Apellido;
	protected Curso curso;
	
	public Celador(){
		curso = new Curso();
	}
	public String PromoverAlumno(){
		curso.ListaAlumnos.get();
	}

	public String ModificarAlumno(){
		
	}
	
	public String InscribirAlumno(){
		
	}
	
	public String EliminarAlumno(){
		
	}
	
	public char getNombre() {
		return Nombre;
	}
	public void setNombre(char nombre) {
		Nombre = nombre;
	}
	public char getApellido() {
		return Apellido;
	}
	public void setApellido(char apellido) {
		Apellido = apellido;
	}
	
	
}
