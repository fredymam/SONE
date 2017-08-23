package logica;

import java.util.ArrayList;

public class Celador extends Persona {
	public ArrayList<Curso> listacurso;
	public ArrayList<Alumno>listaalumnos;
	
	public Celador(String nombre, String apellido, int DNI){
		super(nombre, apellido, DNI);
	}
	
	public int Cantcurso(){
		return listacurso.size();
		
	}
	
	public int Cantalumnos(){
		return listaalumnos.size();
	}
	
	public void Tutor(){
		
	}
}



