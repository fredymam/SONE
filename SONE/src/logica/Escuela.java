package logica;

import java.util.ArrayList;

public class Escuela {
	protected int CUE;
	protected String Nombre;
	protected int A�o;
	protected int Division;
	protected ArrayList<Curso> ListaCursos;
	
	
	public Escuela(int CUE, String Nombre) {
		this.CUE = CUE;
		this.Nombre = Nombre;
		ListaCursos = new ArrayList<Curso>();
	}
	
	public void AgregarCurso(int A�o, int Division){
		this.A�o = A�o;
		this.Division = Division;
		Curso curso = new Curso(7,1);
		ListaCursos.add(curso);	
	}
	
	//public Curso BuscarCurso(int A�o, int Division){
		//this.A�o = A�o;
		//this.Division = Division;
	//}
	
	
}
