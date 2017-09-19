package test;

import logica.Colegio;
import logica.Curso;

/* Esqueleto tentativo para modelar los servicios de las diferentes clases 
 * 
 */
public class TestApp {

	public static void main(String[] args) {
		
		//1. login >> autenticaci�n de usuario para utilizar el sistema
		//2. Cargar datos de escuela desde Base de Datos
		Colegio colegio = new Colegio(420014400,"EPET N� 3"); // CUE,Nombre
		
		// Se agregan cursos nuevos
		colegio.AgregarCurso(7,1,'V'); // A�o, Division, Turno
		colegio.AgregarCurso(7,2,'T');
		Curso curso = colegio.BuscarCurso(7,1,'V'); // Metodo que busca un curso y devuelve el objeto.
		System.out.println(curso.getCurso());
		System.out.println(curso.getDivision());
		System.out.println(curso.getTurno());
		
		// Se agregan alumnos nuevos a la division
		/*curso.AgregarAlumno(1,"Wilhelm", "Steinitz"); // DNI, Nombre, Apellido
		curso.AgregarAlumno(2,"Emanuel", "Lasker");
		curso.AgregarAlumno(3,"Jose Ra�l","Capablanca");
		curso.AgregarAlumno(4,"Max", "Euwe");
		curso.AgregarAlumno(5,"Mikhail", "Botvinnik");
		curso.AgregarAlumno(6,"Vasily","Smyslov");
		curso.AgregarAlumno(7,"Mikhail", "Tal");*/
		
		// Escuela.BuscarCurso(7,1).AgregarAlumno(); // equivalente a las l�neas superiores. >> curso, se utiliza como un shortcut
		/*curso.Inasistencia(4);
		curso.Inasistencia(7);
		curso.Notificar("01-08-2017 10:40", "Alumnos se retiran antes, porque falta profe de geograf�a"); */
		
		/*
		 * Por consola, se deber�a visualizar una lista de los tutores notificados>
		 * 
		 */ 
	}

}
