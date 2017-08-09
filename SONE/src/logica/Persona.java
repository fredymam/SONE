package logica;

public class Persona {

	protected String apellido;
	protected String nombre;
	protected int DNI;
	private String email;
	public Persona(String nombre, String apellido, int dni) {
		setApellido(apellido);
		setNombre(nombre);
		setDNI(dni);
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDNI() {
		return DNI;
	}
	public String getEmail() {
		return email;
	}
	
	
	

}
