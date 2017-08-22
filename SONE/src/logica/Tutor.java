package logica;
import java.util.ArrayList;

public class Tutor extends Persona {
	
	private boolean mensaje = false;
	private String notifiacion;

	private ArrayList<Alumno> alumnos;
	
	
	public Tutor(String nombre, String apellido, int dni, String correo, int telefono) {
		super(nombre, apellido, dni);
		setCorreo(correo);
		setAlumnos(new ArrayList<Alumno>());
		setTelefono(telefono);
	}

	private void setAlumnos(ArrayList<Alumno> arrayList) {
		// TODO Auto-generated method stub
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public String getNotifiacion() {
		return notifiacion;
	}

	public void setNotifiacion(String notifiacion) {
		this.notifiacion = notifiacion;
	}

	public boolean isMensaje() {
		return mensaje;
	}

	public void setMensaje(boolean mensaje) {
		this.mensaje = mensaje;
	}
}