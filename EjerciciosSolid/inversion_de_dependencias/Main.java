package inversion_de_dependencias;

public class Main {

	public static void main(String[] args) {
        Motor motor = new MotorGasolina();
        Auto miAuto = new Auto(motor);
        miAuto.arrancar();
    }
}
