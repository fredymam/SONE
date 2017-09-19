package logica;
import java.util.ArrayList;

public class Curso {
	protected ArrayList<Alumno> alumnos;
	private int curso;
	private int division;
	private Celador celador;
	private int CantAlumnos;
	public int getCantAlumnos() {
		return CantAlumnos;
	}

	public void setCantAlumnos(int cantAlumnos) {
		CantAlumnos = cantAlumnos;
	}

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
	
	public String getAlumno(int i){
		Alumno alumno = alumnos.get(i);
		
		return alumno.getApellido() + " " + alumno.getNombre() + " " + alumno.getDNI();
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



	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	void AsignarCelador(Celador cel){
		celador = cel;
	}
	
	public Celador getCelador() {
		return celador;
	}

	public void setCelador(Celador celador) {
		this.celador = celador;
	}

	public boolean Notificar(){
		return true;
	}
	
	public void AgregarAlumno(Alumno a){
		alumnos.add(a);
		CantAlumnos++;
	}
	
	public boolean Quitar(Alumno a){
		alumnos.remove(a);
		CantAlumnos--;
		return true;
	}
	
	
}
