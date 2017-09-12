package logica;

public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected int dni;
	protected int telefono;

	public Persona(String nombre, String apellido ,int dni, String correo, int telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;	
		this.correo = correo;
		this.telefono = telefono;
	}
	
	

	public Persona(String nombre2, String apellido2, int dni2, String correo2) {
		// TODO Auto-generated constructor stub
	}



	public int getTelefono() {
		return telefono;
	}
	
	public int getdni(String string) {
		return dni;
	}

	public boolean setdni(int string) {
		this.dni = string;
		return false;
	}

	public char[] getnombre1(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getCorreo(){
		return this.correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}


	public char[] getnombre(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getapellido(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getcorreo(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	public char[] getapellido2(String string) {
		// TODO Auto-generated method stub
		return null;
	}






	






	
}







/*
import java.util.*;
class Alumnos{
   private int nota;
   private String nombre;
   public void setNota(int nota){
      this.nota = nota;
   }
   public int getNota( ){
      return this.nota;
   }
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   public String getNombre( ){
      return this.nombre;
   }
}
class ComparaNota implements Comparator{/**hay que implementar la interfazComparator y definir el método compare()
   public int compare (Object alum1, Object alum2){
      int alum1Nota = ((Alumnos)alum1).getNota( );//hacemos un casting
      int alum2Nota = ((Alumnos)alum2).getNota( );
      if(alum1Nota > alum2Nota){//ordenamos de mayor a menor
         return -1;
      }else if(alum1Nota < alum2Nota){
         return 1;
      }else{
         return 0;
      }
   }
}
class ComparaNombre implements Comparator{
   public int compare(Object alum1, Object alum2){
      String alum1Nombre = ((Alumnos) alum1).getNombre( );
      String alum2Nombre = ((Alumnos) alum2).getNombre( );
      return alum1Nombre.compareTo(alum2Nombre);/**usamos el método compareTo para un orden  alfabético       
   }
}
public class EjemploComparatorJava{//creamos el array y le añadimos valores
   public static void main(String[ ] args){
      Alumnos alumnos[ ] = new Alumnos[3];
      alumnos[0] = new Alumnos( );
      alumnos[0].setNota(8);
      alumnos[0].setNombre("Ana");
      alumnos[1] = new Alumnos( );
      alumnos[1].setNota(6);
      alumnos[1].setNombre("Xose");
      alumnos[2] = new Alumnos( );
      alumnos[2].setNota(3);
      alumnos[2].setNombre("Carlos");
      System.out.println("Alumnos desordenados");
      for(int i = 0; i<alumnos.length;i++){
         System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
      }
      Arrays.sort(alumnos, new ComparaNota( ));/**usamos el método sort para ordenar las notas
      System.out.println("Alumnos ordenados por notas");
      for(int i = 0; i<alumnos.length; i++){
         System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
      }
      Arrays.sort(alumnos, new ComparaNombre( ));/**ahora ordenamos los nombres
      System.out.println("Alumnos ordenados por nombre");
      for(int i = 0;i<alumnos.length; i++){
         System.out.println("Alumno "+(i+1)+" Nombre:     "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
      }
   }
}



   La salida será como sigue:


Alumnos desordenados
Alumno 1 Nombre: Ana Nota: 8
Alumno 2 Nombre: Xose Nota: 6
Alumno 3 Nombre: Carlos Nota: 3
Alumnos ordenados por notas
Alumno 1 Nombre: Ana Nota: 8
Alumno 2 Nombre: Xose Nota: 6
Alumno 3 Nombre: Carlos Nota: 3
Alumnos ordenados por nombres
Alumno 1 Nombre: Ana Nota: 8
Alumno 2 Nombre: Carlos Nota: 3
Alumno 3 Nombre: Xose Nota: 6
*/


