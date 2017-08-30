package logica;

public class Tutor extends Persona {

	private int DNI_Alumno;
	private String email;
	private String N_Celular;
	private boolean Notificar_email;
	private boolean Notificar_SMS;
	
	
	

	public Tutor(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		}
	
		public int getDNI_Alumno() {
			return DNI_Alumno;
		}


		public void setDNI_Alumno(int dNI_Alumno) {
			DNI_Alumno = dNI_Alumno;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getN_Celular() {
		return N_Celular;
		}	


		public void setN_Celular(String n_Celular) {
			N_Celular = n_Celular;
		}

		public boolean isNotificar_email() {
			return Notificar_email;
		}

		public void setNotificar_email(boolean notificar_email) {
			Notificar_email = notificar_email;
		}

		public boolean isNotificar_SMS() {
			return Notificar_SMS;
		}

		public void setNotificar_SMS(boolean notificar_SMS) {
			Notificar_SMS = notificar_SMS;
		}
	
		public void H_D_email(){
			if(Notificar_email== true){
				Notificar_email=false;
			}else {
				Notificar_email= true;
			}
		}
		
		public void H_D_SMS(){
			if (Notificar_SMS==true){
				Notificar_SMS=false;
			}else {
				Notificar_SMS=true;
			}
		}
}
