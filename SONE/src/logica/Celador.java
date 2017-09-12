package logica;

import java.util.ArrayList;

public class Celador extends Persona {
	
	private int Num_celador; // IMPORTANTE : variable creada por nico para creacionde getter y setter
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

	public int getNum_celador() {
		return Num_celador;
	}

	public void setNum_celador(int num_celador) {
		Num_celador = num_celador;
	}
}



