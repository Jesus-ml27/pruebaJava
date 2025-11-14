import java.util.Scanner;

public class UsaTrabajador
{
	public static void main(String[] args)
	{
        int horastrabajadas=0;
        int i;
        double suma=0;
        Trabajador[] trabajadores= new Trabajador[3];
        trabajadores[0]= new Trabajador("daniel",0,'M');
        trabajadores[1]= new Trabajador("Victoria",2,'F');
        trabajadores[2]= new Trabajador("Jesus",6,'M');

        System.out.println("Longitud de la array: "+trabajadores.length);
        
        for(i=0;i<trabajadores.length;i++)
        {
            Trabajador trabajadoractual= trabajadores[i];
            suma=suma+trabajadoractual.getHoras();
        }

        for(i=0;i<trabajadores.length;i++)
        {
            Trabajador trabajadoractual= trabajadores[i];
            System.out.println("Trabajador "+(i+1)+": "+trabajadoractual.getNombre()+" Horas trabajadas: "+trabajadoractual.getHoras()+" Se le pagara: "+(trabajadoractual.getHoras()*50)+" Pesos");
            
        }
        System.out.printf("promedio de horas trabajadas: %.2f",suma/3);
	}


}