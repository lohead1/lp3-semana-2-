package lp3;

public class Automovil {
	private String placa; 
	private int numPuertas; 	
	private String marca; 
	private String modelo; 
	private Motor motor; 
	
	public Automovil(String placa, int nPuertas, String modelo,String marca,Motor motor) { 
		this.placa=placa; 
		this.numPuertas=nPuertas; 
		this.marca=marca;
		this.modelo=modelo;
		this.motor=motor; 
	}
	
	public void setPlaca(String placa) { 
		this.placa=placa;
			}
	public String getPlaca() {
		return placa; 
	}
	public void setnumPuertas(int numPuertas) {
		this.numPuertas=numPuertas; 
	}
	public int getnumPuertas() {
		return numPuertas; 
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getMarca() {
		return marca;
	}
	public void SetModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getModelo() {
		return modelo;
	}	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Motor getMotor() {
		return motor;
	}

	@Override 
		
	public String toString() {
		return  "Automovil: placa='" + placa + '\'' +
		           ", numPuertas=" + numPuertas +
		           ", marca='" + marca + '\'' +
		           ", modelo='" + modelo + '\'' +
		           ", motor= " + motor; 			
		}
	}

