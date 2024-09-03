package actividad4;

public class Persona {
    private int id; 
    private String nombre; 
    private String apellido; 
    private Cuenta cuenta; 
  
    public Persona(int id, String nombre, String apellido, int numero, double saldo) {
        this.id = id; 
        this.nombre = nombre; 
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero, saldo); 
    }
    

    public Persona(int id, String nombre, String apellido, int numero) {
        this(id, nombre, apellido, numero, 0); 
    }
    
    public void setId(int id) {
        this.id = id; 
    }
    
    public int getId() {
        return id; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public String getNombre() {
        return nombre; 
    }
    
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta; 
    }
    
    public Cuenta getCuenta() {
        return cuenta; 
    }
    
    @Override 
    public String toString() {
        return "Persona: id=" + id +
               ", nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", cuenta=" + cuenta;
    }
    
}
