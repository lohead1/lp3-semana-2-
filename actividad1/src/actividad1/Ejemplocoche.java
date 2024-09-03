package actividad1;

public class Ejemplocoche {
	public static void main(String[] args) {

		 Coche coche3 = new Coche("Audi", "A3 Sedan", 2019, 28000.0);

		 coche3.setPrecio(25000.0);
		 coche3.setVelocidadMaxima(250);
		 coche3.setPotenciaMotor(320);

		 System.out.println("Coche3: " + coche3.getPrecio() + " " + coche3.getPotenciaMotor() +  ", " + coche3.getVelocidadMaxima());
	}
 }

