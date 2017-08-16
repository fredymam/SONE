package logica;
import java.util.ArrayList;
import logica.Curso;

public class Celador extends Persona {
	
	private ArrayList<Curso> cursos;

	public Celador(String nombre, String apellido, int dni, String correo) {
		super(nombre, apellido, dni);
		cursos = new ArrayList<Curso>();
		setCorreo(correo);
	}
	
	// Metodo para crear un Curso
	public void crearCurso(int numero_curso, int division, String turno){
		Curso curso = new Curso(numero_curso, division, turno);
		cursoAlta(curso);
	}
	
	public void cursoAlta(Curso curso){
		System.out.println(curso.getNumero_curso());
		System.out.println(curso.getDivision());
		System.out.println(curso.getTurno());
	}
	
	public String enviarNotificacion(){
		return "g";
	}
}
