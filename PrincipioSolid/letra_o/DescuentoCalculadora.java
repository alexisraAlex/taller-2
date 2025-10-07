package letra_o;

public class DescuentoCalculadora {

	   public double calcular(String tipo) {
	        if (tipo.equals("navidad")) return 0.2;
	        if (tipo.equals("verano")) return 0.1;
	        return 0.0;
	   }
}
