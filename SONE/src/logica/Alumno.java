package logica;

public class Alumno extends Persona{
	
	private int CursoActual;
	private int División;
	private String Turno;
	private int DNI_Tutor;
	
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre,apellido,dni);
	}
	
	public void cambiarCurso(int curso,int division){
		
	}

	public int getCursoActual() {
		return CursoActual;
	}

	public void setCursoActual(int curso) {
		CursoActual = curso;
	}
	
	public void AsignarCurso(Curso c){
		c.AgregarAlumno();
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

	public int getDNI_Tutor() {
		return DNI_Tutor;
	}

	public void setDNI_Tutor(int dNI_Tutor) {
		DNI_Tutor = dNI_Tutor;
	}

}
