package test;

public class TestGilada {
	
	Escuela escuela = new Escuela (1, 'Epet3');
	Curso c1 = new Curso (4,1); //año, division
	Escuela.agregarCurso (c1);
	
	c1.agregarAlumno(new Alumno (123, Marcelo, Mana); //dni, nombre, apellido
	c1.agregarAlumno(new Alumno (321, Carl, Sagan);
	
	c1.notificar(10:43, 'Falta profe de programacion'); //hora, motivo
}
 ///////////////////////////////////////////////////////////////////////////

public class TestEscuela {
	public static void main (String [] args){
		-login
		-crear escuela
	}
	
	public class curso {
		private ArrayList<Alumnos> alumnos;
		public boolean notificar (int hora, String motivo){
			for (int i=0; ¿<alumnos.size(); i++){
				alumnos.get(i).notificar(hora,motivo);
				//i SendMail (alumnos.get(i).tutorcorreo);
			}
		}
	}
}