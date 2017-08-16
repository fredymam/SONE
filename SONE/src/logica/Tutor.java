package logica;
import java.util.ArrayList;

public class Tutor extends Persona {
	private ArrayList<Alumno> alumnos;
	
	public Tutor(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		alumnos = new ArrayList<Alumno>();		
	}

	
}
