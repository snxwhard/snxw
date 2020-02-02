package copia;
/**
 *
 * @author SnxwHard
 */
public class Alumno {
    private String carnet;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno() {
        carnet = "no esta";
        nombre = "no esta";
        apellido = "no esta";
        edad = 0;
    }

    
    public void setCarnet(String carnet) 
    {this.carnet = carnet;   }
    
    public void setNombre(String nombre) 
    {this.nombre = nombre; }
    
    public void setApellido(String apellido) 
    {this.apellido = apellido; }
   
    public void setEdad(int edad) 
    {this.edad = edad; }

    
    
    
    public String getCarnet() 
    {return carnet; }
    
    public String getNombre() 
    {return nombre; }
    
    public String getApellidos() 
    { return apellido; }
    
    public int getEdad() 
    {return edad;}
}