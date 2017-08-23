package logica;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int DNI;
	//private String correo;
	//sprivate int tel;
	
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

	/*public String getCorreo() {
		return correo;
	}

	public int getTel() {
		return tel;
	}*/

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	/*public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}*/

}
