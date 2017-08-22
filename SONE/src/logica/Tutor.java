package logica;
import java.util.ArrayList;

public class Tutor extends Persona {
	
	private boolean respuesta = false;
	private int faltas = 0; 
	private String faltasprofesores = "lengua";
	private boolean Consultarasistencias = false;
	private ArrayList<Alumno> alumnos;
	
	
	public Tutor(String nombre, String apellido, int dni, String correo, int telefono) {
		super(nombre, apellido, dni);
		setCorreo(correo);
		setTelefono(telefono);
		setAlumnos(new ArrayList<Alumno>());
	}
	
	private void setAlumnos(ArrayList<Alumno> arrayList) {
		// TODO Auto-generated method stub
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	private boolean respuesta() {
			
		if (this.respuesta){
			return true;
		} 
		else {
			return false;
		}
	}
	
	//private int getFaltas() {	
	//	}
	
	//private String getConsultarasistencias() {
	//}

	
}