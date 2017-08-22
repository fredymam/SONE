package test;
import logica.Celador;

public class TestCelador {

	public static void main(String[] args) {
		Celador c1;
		c1 = new Celador("EDGAR", "ROLDAN", 41185839, "celador@celador.com");
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println(c1.getDni());
		System.out.println(c1.getCorreo());
		
		
		c1.crearCurso(1, 1, "Mañana");
	}

}
