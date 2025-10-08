package inversion_de_dependencias;

public class Auto {

	 private Motor motor;

	    public Auto(Motor motor) {
	        this.motor = motor;
	    }

	    public void arrancar() {
	        motor.encender();
	    }
	
}
