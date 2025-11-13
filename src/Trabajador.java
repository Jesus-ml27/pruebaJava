import java.util.Scanner;


public class Trabajador {
    private String nombre;
    private int horas;
    private char sexo;
    
    public Trabajador(String nombre, int horas, char sexo)
    {
        this.nombre = nombre;
        this.horas = horas;
        this.sexo = sexo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getHoras()
    {
        return horas;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public String toString()
    {
        return nombre + "\t" + horas;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Trabajador[] trabajadores = new Trabajador[3];
        
        
        
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Ingrese el nombre del trabajador:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese las horas trabajadas:");
            int horas = sc.nextInt();
            System.out.println("Ingrese el sexo del trabajador (M/F):");
            char sexo = sc.next().charAt(0);
            sc.nextLine(); 
            
            Trabajador trabajador = new Trabajador(nombre, horas, sexo);
            trabajadores[i] = trabajador;
            
            System.out.println("Trabajador creado: " + trabajador.toString());
        }
    }

}