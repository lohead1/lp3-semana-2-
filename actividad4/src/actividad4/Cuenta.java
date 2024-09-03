package actividad4;

public class Cuenta {
	private int numero; 
	private double saldo; 
	
	public 	Cuenta(int numero,double saldo) {
		this.numero=numero; 
		this.saldo=saldo; 
		
	}
	public Cuenta(int numero) { 
		this(numero,0); 
	}	
	public void setNumero(int numero) {
		this.numero=numero; 
	}
	public int getNumero() {
		return numero; 
	}
	public void setSaldo(double saldo) { 
		this.saldo=saldo; 
	}
	public double getSaldo() {
		return saldo; 
	}
	public 	String toString(){
		return "Cuenta: numero=" + numero +
	               ", saldo=" + saldo; 
				
	}
}
