package test;
import logica.Alumno;
import logica.Celador;
import logica.Curso;

public class TestCurso {

	public static void main(String[] args) {
		
		Celador c1;
		c1 = new Celador("EDGAR", "ROLDAN", 41185839);
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println(c1.getDni());
		System.out.println(c1.getCorreo());
		
		System.out.println("---------------------------------------");
		
		Curso t1;
		t1 = new Curso (1, 1, "Ma�ana");
		
		Curso t2;
		t2 = new Curso(1, 1, "Ma�ana");
		
		
		Alumno a1;
		a1 = new Alumno("amilcar","britos",41185839, t1);
		System.out.println(a1.getNombre());
		System.out.println(a1.getApellido());
		System.out.println(a1.getDni());
		System.out.println(a1.curso.getTurno());
		System.out.println(a1.curso.getDivision());
		System.out.println(a1.curso.getNumero_curso());
		
	System.out.println("---------------------------------------");
		
		Alumno a2;
		a2 = new Alumno("Juan","Amores",4123456, t2);
		System.out.println(a2.getNombre());
		System.out.println(a2.getApellido());
		System.out.println(a2.getDni());
		System.out.println(a2.curso.getTurno());
		System.out.println(a2.curso.getDivision());
		System.out.println(a2.curso.getNumero_curso());
				
		
		
		
				
	}

}
