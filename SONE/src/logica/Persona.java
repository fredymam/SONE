package logica;

public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected int dni;
	protected int telefono;
	
	public Persona(String nombre, String apellido ,int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getCorreo(){
		return this.correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	public int getTelefono(){
		return this.telefono;
	}
}
