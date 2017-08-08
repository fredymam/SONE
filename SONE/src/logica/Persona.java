package logica;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private String correo;
	private int dni;
	private int telefono;
	
	public Persona(String nombre, String apellido ,int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
}
