package logica;

import java.util.ArrayList;

public class Colegio {	
	protected int CUE;
	protected String Nombre;
	protected ArrayList<Curso> ListaCursos;
	
	public Colegio(int CUE,String Nombre){
		ListaCursos = new ArrayList<Curso>();
		this.CUE = CUE ;
		this.Nombre = Nombre;
			
	}
	
	public Curso BuscarCurso(int Año, int Division) {
		return null;
	}
	
	public void AgregarCurso(int Curso, int Division, char Turno) {
		Curso c1 = new Curso(Curso, Division, Turno);  
		ListaCursos.add(c1);
	}
	
	public void AgregarAlumno(){
		
	}
}
