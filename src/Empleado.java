import java.util.Scanner;

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
    
    public static void main (String[] args)
    {

        Empleado[] empleados = new Empleado[3];
        
        for (int i=0; i<3; i++) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del empleado:");
            String nom = sc.nextLine();
            System.out.println("Ingrese las horas trabajadas:");
            int hr = sc.nextInt();
            Empleado emp = new Empleado(nom, hr);
            System.out.println("Empleado creado: " + emp.toString());
        }

        
        
    }
}