package logica;
import java.util.ArrayList;
import logica.Tutor;
import logica.Alumno;
import logica.Curso;

public class Celador extends Persona {
	
	private Alumno alumno;
	private ArrayList<Tutor> tutores;
	private ArrayList<Curso> cursos;

	public Celador(String nombre, String apellido, int dni, String correo) {
		super(nombre, apellido, dni);
		tutores = new ArrayList<Tutor>();
		cursos = new ArrayList<Curso>();
		setCorreo(correo);
	}
	
	public void crearAlumno(String nombre, String apellido, int dni){
		Alumno alumno = new Alumno(nombre, apellido, dni);
		alumnoAlta(alumno);
	}
	
	public void alumnoAlta(Alumno alumno){
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellido());
		System.out.println(alumno.getDni());
	}
	
	public String enviarNotificacion(){
		return "g";
	}
}
