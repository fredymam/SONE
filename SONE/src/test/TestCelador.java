package test;
import logica.Celador;
import logica.Curso;
import logica.Persona;
import logica.Alumno;

public class TestCelador {

	private static Persona a1;

	public static void main(String[] args) {
		Celador c1;
		c1 = new Celador("EDGAR", "ROLDAN", 41185839, "celador@celador.com");
		a1 = null;
		System.out.println(a1.getnombre1(""));
		System.out.println(a1.getapellido(""));
		System.out.println(a1.getdni(""));
		System.out.println(a1.getcorreo(""));
	

	
		
		Curso mañana = c1.buscarCurso(1, 1);
		
		Curso vespertino = c1.buscarCurso(3, 3);
		
		c1.crearAlumno("Amilcar", "Britos", 41000999, mañana);
		c1.crearAlumno("Juan", "Amores", 41000989, vespertino);
		
		for(Alumno alumno : c1.alumnos){
			System.out.println(alumno.curso.turno);
		}
	}

}
