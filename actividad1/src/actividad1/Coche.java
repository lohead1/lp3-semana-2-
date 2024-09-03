package actividad1;

public class Coche {
    public String color;
    public String modelo;
    private int velocidadMaxima;
    private int potenciaMotor;
    private boolean enMarcha;
    public String marca;
    private int anoFabricacion; 
    private double precio;
    
    public Coche() {
        this.enMarcha = false;
    }

    public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
        this.modelo = modelo;
        this.setVelocidadMaxima(velocidadMaxima);
        this.setPotenciaMotor(potenciaMotor);
        this.enMarcha = false;  
    }

    public Coche(String marca, String modelo, int anoFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.setPrecio(precio);
    }
    
    public boolean aplicarDescuento(double descuento) {
        if (anoFabricacion <= 2010) {
            this.setPrecio(this.getPrecio() - descuento);
            System.out.println("El coche " + modelo + " tiene un descuento aplicado.");
            return true;
        } else {
            System.out.println("El coche " + modelo + " no tiene descuento.");
            return false;
        }
    }
    
    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está acelerando.");
        } else {
            System.out.println("Primero enciende el coche.");
        }
    }
    
    public void frenar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está frenando.");
        } else {
            System.out.println("El coche está apagado, no se puede frenar.");
        }
    }


    public void encender() {
        enMarcha = true;
        System.out.println("El coche " + modelo + " se ha encendido.");
    }


    public void apagar() {
        enMarcha = false;
        System.out.println("El coche " + modelo + " se ha apagado.");
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

	
