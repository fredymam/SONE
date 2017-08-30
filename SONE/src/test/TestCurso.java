package test;

import logica.Curso;
import logica.Alumno;

public class TestCurso {

	public TestCurso() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Curso c1;
		c1= new Curso(1, 2, 'M');
		
		System.out.println("Curso: " + c1.getCurso());
		System.out.println("Division: " + c1.getDivision());
		System.out.println("Turno: " + c1.getTurno());
		
		Alumno a1;
		a1= new Alumno("Pamela", "Bello", 5421541);
		Alumno a2;
		a2= new Alumno("Juan Manuel", "Amores", 4145454);
		Alumno a3;
		a3= new Alumno("Lucía", "Baschiasueli", 4146656);
		
		c1.AgregarAlumno(a1);
		c1.AgregarAlumno(a2);
		c1.AgregarAlumno(a3);
		
		System.out.println("Alumnos");
		System.out.println("_______________________");
		for(int i=0; i<c1.getCantAlumnos(); i++){
			System.out.println(c1.getAlumno(i));	
		}
		 
 
	}

}
