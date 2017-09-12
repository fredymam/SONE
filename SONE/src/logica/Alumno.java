package logica;

public class Alumno extends Persona{
	
	private Curso EsteCurso; // curso en el que se trabaja
	private int División; // numero entero
	private String Turno; // T tarde  M añana  V vespertino
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

	public int getDivisión() {
		return División;
	}

	public void setDivisión(int división) {
		División = división;
	}

	public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}


}
