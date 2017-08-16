package test;
import logica.Celador;

public class TestCelador {

	public static void main(String[] args) {
		Celador c1;
		c1 = new Celador("Celador1", "Celador", 41185839, "celador@celador.com");
		
		c1.crearCurso(1, 1, "Mañana");
	}

}
