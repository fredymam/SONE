package model.logic;

public abstract class Persona {	
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected int telefono;

	public Persona(String nombre, String apellido ,int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;	
	}
	
	public String getNombre(){
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}
	
	public int getDni() {
		return dni;
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
	
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}	
}