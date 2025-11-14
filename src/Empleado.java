public class Empleado
{
    
    private String nombre;
    private int horas;
    
    
    public Empleado (String nom, int hr)
    {
        nombre=nom;
        horas=hr;
        
    }
    
    public String getNombre()
    {
        return nombre;
        
    }
    
    
    public int getHoras()
    {
        return horas;    
    }
    
    public String toString()
    {
        return nombre + "," +horas;
    }

}