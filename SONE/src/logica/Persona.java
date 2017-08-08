package logica;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int DNI;
	private String email;
	private int tel;
	
	public Persona(String nombre, String apellido, int DNI) {
				
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDNI() {
		return DNI;
	}

	public String getEmail() {
		return email;
	}

	public int getTel() {
		return tel;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

}
