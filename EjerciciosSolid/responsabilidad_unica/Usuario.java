package responsabilidad_unica;

public class Usuario {

	 public void registrar(String nombre) {
	        System.out.println("Registrando usuario: " + nombre);
	    }

	    public void enviarCorreo(String nombre) {
	        System.out.println("Enviando correo a: " + nombre);
	    }
	//Esta clase está violando este principio de responsabilidad única
}
