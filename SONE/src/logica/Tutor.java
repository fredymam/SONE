package logica;

public class Tutor extends Persona {
	
	protected char Nombre;	
	protected char Apellido;
	protected String Email;
	protected int Telefono;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	protected int Dni;
	

}

