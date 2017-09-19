package logica;

import java.util.ArrayList;

public class Escuela {
	protected int CUE;
	protected String Nombre;
	protected int Año;
	protected int Division;
	protected char Turno;
	protected ArrayList<Curso> ListaCursos;
	
	
	public Escuela(int CUE, String Nombre) {
		this.CUE = CUE;
		this.Nombre = Nombre;
		ListaCursos = new ArrayList<Curso>();
	}
	
	public void AgregarCurso(int Año, int Division){
		this.Año = Año;
		this.Division = Division;
		Curso curso = new Curso(7,1);
		ListaCursos.add(curso);
	}

	public Curso BuscarCurso(int Año, int Division, char Turno){
		Curso resultado = null;
		for(Curso curso:ListaCursos){
			if (curso.getAño()==Curso && curso.getDivision()==Curso && curso.getTurno()==Curso){
	}
		 return resultado;
	}
	
	
}
}