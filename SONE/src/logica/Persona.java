package logica;
import java.util.*;

public abstract class Persona implements Comparable {
	
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
	
	public int getTelefono() {
		return telefono;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
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
	
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}
	
}
