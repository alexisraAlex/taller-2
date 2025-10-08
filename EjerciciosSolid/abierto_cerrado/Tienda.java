package abierto_cerrado;

public class Tienda {

	 public void mostrarPrecioFinal(Descuento d, double precio) {
	        System.out.println("Precio final: " + d.aplicar(precio));
	    }
	
}
