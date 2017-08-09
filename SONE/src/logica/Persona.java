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
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApllido(){
		return this.apellido;
	}
	
	public String getCorreo(){
		return this.correo;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	public int getTelefono(){
		return this.telefono;
	}
}
