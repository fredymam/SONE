package logica;

public class Alumno extends Persona {
 
	public Tutor tutor;
	public Curso curso;
	
	public Alumno(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
	
	}
	
}

/*1.Definir	ArayListcclases> nombre >>ArrayList<Alumno>alumnos;
2.Crear Alumnos = new ArrayList<alumno>;
3.Metodos -get alumnos.get(3);
		  -add alumnos.add(a1);//alumno.add(new Alumno('Nahuel');
		  -size alumnos.size();
		  -set alumnos.set(2,a2);*/