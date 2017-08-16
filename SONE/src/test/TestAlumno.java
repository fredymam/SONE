package test;
import logica.Alumno;

public class TestAlumno {

	public static void main(String[] args) {
		
		Alumno a1;
		a1 = new Alumno("amilcar","britos",41185839,"mañana",3,1);
		System.out.println(a1.getNombre());
		System.out.println(a1.getApellido());
		System.out.println(a1.getDni());
		System.out.println(a1.getTurno());
		System.out.println(a1.getDivision());
		System.out.println(a1.getNumero_curso());
		
	}
	

}
