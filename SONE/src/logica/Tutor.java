package logica;

public class Tutor extends Persona {

	private int DNI_Alumno;
	private String email;
	private String N_Celular;
	
	public Tutor(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		
	}
	
	public int getDNI_Alumno() {
		return DNI_Alumno;
	}


	public void setDNI_Alumno(int dNI_Alumno) {
		DNI_Alumno = dNI_Alumno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getN_Celular() {
		return N_Celular;
	}


	public void setN_Celular(String n_Celular) {
		N_Celular = n_Celular;
	}


	
		
}
