// Ejercicio en clase version dos (el que utiliza dos arrays)

import java.util.Scanner;
public class EmpleadosV2 {
    public static void main(String[] args) {
        int numeroEmpleados = 3;
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[numeroEmpleados]; // Array para almacenar los nombres
        int[] horas = new int[numeroEmpleados]; // Array para almacenar las horas trabajadas
        double promedio = 0; // Variable para el promedio de horas trabajadas
        double suma = 0; // Variable para la suma de horas trabajadas
        int c=0; // Contador de empleados que superan el promedio
        int i; // Variable de control para los bucles


        System.out.println("Longitud de la array: "+ numeroEmpleados ); 

		for( i=0;i < numeroEmpleados ; i++ ) { // Bucle para ingresar los datos de cada empleado    
			System.out.println("Introduce el nombre del empleado:");
			nombres[i]=sc.nextLine();
			System.out.println("Introduce las horas trabajadas:");
			horas[i]=sc.nextInt();
			sc.nextLine();
		}
         
        sc.close();

        for(i=0;i<numeroEmpleados;i++) { // Bucle para calcular la suma de horas trabajadas
            suma=suma+horas[i];
        }
         promedio=suma/numeroEmpleados;

         promedio=suma/numeroEmpleados;

		for(i=0;i<numeroEmpleados;i++) { // Bucle para mostrar los datos de cada empleado
			
			System.out.println("Empleado "+(i+1)+": "+nombres[i]+" Horas trabajadas: "+horas[i]+" Se le pagara: "+(horas[i]*50)+" Pesos");
            if(horas[i]>promedio){
            c++;
            }
			
		}
		System.out.printf("promedio de horas trabajadas: %.2f", promedio);
        System.out.println("\nCantidad de empleados que superan el promedio de horas trabajadas: " + c);
    }
}