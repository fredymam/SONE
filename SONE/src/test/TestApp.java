package test;

import logica.Curso;
import logica.Escuela;

/* Esqueleto tentativo para modelar los servicios de las diferentes clases 
 * 
 */
public class TestApp {

	public static void main(String[] args) {
		//1. login >> autenticación de usuario para utilizar el sistema
		//2. Cargar datos de escuela desde Base de Datos
		Escuela escuela = new Escuela(420014400,"EPET N° 3"); // CUE,Nombre
		
		// Se agregan cursos nuevos
		Escuela.crearCurso(1, 7, "mañana"); // Año, Division
		Escuela.crearCurso(2, 1, "tarde");
		
		Curso curso = Escuela.buscarCurso(7, 1); // Metodo que busca un curso y devuelve el objeto.
		// Se agregan alumnos nuevos a la division
		escuela.crearAlumno("Steinitz", "Wilhelm", 1, curso); // DNI, Nombre, Apellido
		escuela.crearAlumno("Emanuel", "Lasker", 2, curso);
		escuela.crearAlumno("Jose Raúl","Capablanca", 3, curso);
		escuela.crearAlumno("Max", "Euwe", 4, curso);
		escuela.crearAlumno("Mikhail", "Botvinnik", 5, curso);
		escuela.crearAlumno("Vasily","Smyslov", 6, curso);
		escuela.crearAlumno("Mikhail", "Tal", 7 , curso);
		
		// Escuela.BuscarCurso(7,1).AgregarAlumno(); // equivalente a las líneas superiores. >> curso, se utiliza como un shortcut
		curso.Inasistencia(4);
		curso.Inasistencia(7);
		curso.Notificar("01-08-2017 10:40","Alumnos se retiran antes, porque falta profe de geografía");
		
		/*
		 * Por consola, se debería visualizar una lista de los tutores notificados>
		 * 
		 */ 
	}

}