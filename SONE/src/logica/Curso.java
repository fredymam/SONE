package logica;

public class Curso {
	
	public int numero_curso;
	public int division;
	public String turno;
	
	public Curso(int numero_curso,int division, String turno) {
		this.numero_curso = numero_curso;
		this.turno = turno;
		this.division = division;
		
	}
	
	
	public int getNumero_curso() {
		return numero_curso;
	}
	public void setNumero_curso(int numero_curso) {
		this.numero_curso = numero_curso;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getTurno() {
		return turno;
	}
	
	
	
	
}
