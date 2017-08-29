package test;
import logica.Tutor;

public class TestTutor {

	public static void main(String[] args) {
		
		Tutor t1;
		t1 = new Tutor("Tutor", "Garca1", 456456, "correogmail" ,230215);
		System.out.println(t1.getNombre());
		System.out.println(t1.getApellido());
		System.out.println(t1.getDni());
		System.out.println(t1.getCorreo());
		System.out.println(t1.getTelefono());
		System.out.println(t1.getAlumnos());
		System.out.println((""));
		System.out.println((""));
	}
}
