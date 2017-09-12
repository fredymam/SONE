package logica;

public class Alumno extends Persona{
	
	private Curso EsteCurso; // curso en el que se trabaja
	private int Divisi�n; // numero entero
	private String Turno; // T tarde  M a�ana  V vespertino
	private Tutor Tutor; // Pensando en volverlo string
	
	
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre,apellido,dni);
	}
		
	public Tutor getTutor() {
		return Tutor;
	}

	public void setTutor(Tutor tutor) {
		Tutor = tutor;
	}

	public void setEsteCurso(Curso esteCurso) {
		EsteCurso = esteCurso;
	}

	public Curso getEsteCurso() {
		return EsteCurso;
	}

	public int getDivisi�n() {
		return Divisi�n;
	}

	public void setDivisi�n(int divisi�n) {
		Divisi�n = divisi�n;
	}

	public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}


}
