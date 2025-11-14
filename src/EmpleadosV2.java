import java.util.Scanner;

public class EmpleadosV2 {
    public static void main(String[] args) {
        int numeroEmpleados = 3;
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[numeroEmpleados]; 
        int[] horas = new int[numeroEmpleados]; 
        double promedio = 0; 
        double suma = 0; 
        int c=0; 
        int i; 


        System.out.println("Tamaño de el arreglo : "+ numeroEmpleados ); 

		for( i=0;i < numeroEmpleados ; i++ ) {     
			System.out.println("Introduce el nombre del empleado:");
			nombres[i]=sc.nextLine();
			System.out.println("Introduce las horas trabajadas:");
			horas[i]=sc.nextInt();
			sc.nextLine();
		}
         
        sc.close();

        for(i=0;i<numeroEmpleados;i++) { 
            suma=suma+horas[i];
        }
         promedio=suma/numeroEmpleados;

         promedio=suma/numeroEmpleados;

		for(i=0;i<numeroEmpleados;i++) { 
			
			System.out.println("Empleado "+(i+1)+": "+nombres[i]+" Horas trabajadas: "+horas[i]+" Se le pagara: "+(horas[i]*50)+" Pesos");
            if(horas[i]>promedio){
            c++;
            }
			
		}
		System.out.printf("promedio de horas trabajadas: %.2f", promedio);
        System.out.println("\nCantidad de empleados que superan el promedio de horas trabajadas: " + c);
    }
}