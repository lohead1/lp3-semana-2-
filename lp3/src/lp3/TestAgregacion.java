package lp3;

public class TestAgregacion {
	public static void main(String[] args) { 
		Motor motor1 = new Motor(101, 6000);
		Motor motor2 = new Motor(102, 5500);
		Automovil auto1 = new Automovil("A1B234", 4, "A3 SEDAN", "AUDI",motor1);	
		Automovil auto2 = new Automovil("A1A000", 4, "BMW M3", "BMW",motor2);		
		System.out.println(auto1.toString());
        System.out.println(auto2.toString());
			
	}	
}
		