package model.logic;
import model.logic.Celador;

public class Curso {
		
	public int numero_curso;
	public int division;
	public String turno;
	public Celador celador;
	
	public Curso(int numero_curso, int division, String turno) {
		this.numero_curso = numero_curso;
		this.turno = turno;
		this.division = division;
	}
	
	public String toString() {
		return this.numero_curso + " " + this.division + " " + this.turno;
	}
	
	public int getNumero_curso() {
		return this.numero_curso;
	}
	
	public void setNumero_curso(int numero_curso) {
		this.numero_curso = numero_curso;
	}
	
	public int getDivision() {
		return this.division;
	}
	
	public void setDivision(int division) {
		this.division = division;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return this.turno;
	}
}