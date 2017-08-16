package logica;
import java.util.ArrayList;

public class Curso {
	private ArrayList<Alumno> alumnos;
	private int curso;
	private int division;
	private int celador;
	private char turno; // M T V
	
	
	public Curso(int c, int d, char t) {
		alumnos = new ArrayList<Alumno>();
		curso = c;
		division = d;
		turno = t;
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
		celador = cel.getId_celador();
	}
	
	boolean Notificar(){
		return true;
	}
	
	void AgregarAlumno(Alumno a){
		alumnos.add(a);
	}
	
	boolean Quitar(Alumno a){
		alumnos.remove(a);
		return true;
	}
	
	
	
}
