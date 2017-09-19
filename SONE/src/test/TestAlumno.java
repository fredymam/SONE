package test;
import logica.Alumno;
import logica.Curso;

public class TestAlumno {

	public static void main(String[] args) {
		
		Curso c1;
		c1 = new Curso(1, 1, "Mañana");
		
		Curso c2;
		c2 = new Curso(2, 2, "Tarde");
		
		Alumno a1;
		a1 = new Alumno("juan","Amores",4123456, c1);
		
		System.out.println(a1.getNombre());
		System.out.println(a1.getApellido());
		System.out.println(a1.getDni());
		System.out.println(a1.curso.getTurno());
		System.out.println(a1.curso.getDivision());
		System.out.println(a1.curso.getNumero_curso());
		
		System.out.println("---------------------------------------");
		
		Alumno a2;
		a2 = new Alumno("amilcar","britos",41185839, c2);
		System.out.println(a2.getNombre());
		System.out.println(a2.getApellido());
		System.out.println(a2.getDni());
		System.out.println(a2.curso.getTurno());
		System.out.println(a2.curso.getDivision());
		System.out.println(a2.curso.getNumero_curso());
	}
}
