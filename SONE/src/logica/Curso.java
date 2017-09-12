package logica;
import java.util.ArrayList;

public class Curso {
	private ArrayList<Alumno> alumnos;
	private int curso; // numero entero
	private int division; // numero entero
	private char turno; // basado en variables T tarde M mañana V vespertino
	private int celador; // en base a id o numero
	
	
	
	public Curso(int curso, int division, char turno) {
		alumnos = new ArrayList<Alumno>();
		this.curso = curso;
		this.division = division;
		this.turno = turno;
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public int getCelador() {
		return celador;
	}

	public void setCelador(int celador) {
		this.celador = celador;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	void AsignarCelador(Celador cel){
		celador = cel.getNum_celador();
	}
	
	public boolean Notificar(String Data, String Motivo){
		return true;
	}
	
	public void AgregarAlumno(Alumno a){
		alumnos.add(a);
	}
	
	boolean Quitar(Alumno a){
		alumnos.remove(a);
		return true;
	}

	public void AgregarAlumno(int DNI, String Nombre, String Apellido) {
		
		System.out.println("probando");
		
	}

	public void Inasistencia(int Faltas) {
		
		
	}
	
	
	
}
