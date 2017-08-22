package logica;

public class Alumno extends Persona{
	
	private Curso CursoActual;
	private int División;
	private String Turno;
	private Tutor Tutor;
	
	
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre,apellido,dni);
	}
	
	
	public void asignarCurso(Curso c){
		if(CursoActual != null){
			CursoActual.Quitar(this);
		}
		CursoActual = c;
		CursoActual.AgregarAlumno(this);
	}
	
	public Tutor getTutor() {
		return Tutor;
	}

	public void setTutor(Tutor tutor) {
		Tutor = tutor;
	}

	public void setCursoActual(Curso cursoActual) {
		CursoActual = cursoActual;
	}

	public Curso getCursoActual() {
		return CursoActual;
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
