package test;
import logica.Alumno;

public class TestAlumno {

	public static void main(String[] args) {
		
		Alumno a1;
		a1 = new Alumno("atutu", "rodriguez", 41185839);
		System.out.println(a1.getNombre());
		System.out.println(a1.getApellido());
		System.out.println(a1.getDni());
		
		a1.curso.setNumero_curso(5);
		a1.curso.setDivision(1);
		a1.curso.setTurno("Mañana");
		System.out.println(a1.curso.getNumero_curso());
		System.out.println(a1.curso.getDivision());
		System.out.println(a1.curso.getTurno());
	}

}
