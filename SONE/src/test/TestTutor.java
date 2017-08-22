package test;
import logica.Tutor;


public class TestTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tutor t1;
		t1 = new Tutor("Tutor", "Garca1", 456456, "correogmail" ,230215,);
		System.out.println(t1.getNombre());
		System.out.println(t1.getApellido());
		System.out.println(t1.getDni());
		System.out.println(t1.getCorreo());
		System.out.println(t1.getTelefono());
		System.out.println(t1.getAlumnos());
		System.out.println((""));
		System.out.println((""));
		
		Tutor t2;
		t2 = new Tutor("Tutor", "Garca2", 6786786, "correogmail" ,230215);
		System.out.println(t2.getNombre());
		System.out.println(t2.getApellido());
		System.out.println(t2.getDni());
		System.out.println(t1.getCorreo());
		System.out.println(t1.getTelefono());
		System.out.println(t2.getAlumnos());
		System.out.println((""));
		System.out.println((""));
		
		Tutor t3;
		t3 = new Tutor("Tutor", "Garca3", 2132341, "correogmail" ,230215);
		System.out.println(t3.getNombre());
		System.out.println(t3.getApellido());
		System.out.println(t3.getDni());
		System.out.println(t1.getCorreo());
		System.out.println(t1.getTelefono());
		System.out.println(t3.getAlumnos());
		
		//System.out.println(t3.getFaltas());
		//System.out.println(t3.getConsultarasistencias());
		
		System.out.println((""));
		System.out.println((""));

	}

}
