import java.util.Scanner;


public class UsaEmpleado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado emp1 = new Empleado("Ana", 5);
        Empleado emp2 = new Empleado("Luis", 8);
        Empleado emp3 = new Empleado("Marta", 6);

        Empleado[] empleados = new Empleado[3];
        empleados[0] = emp1;
        empleados[1] = emp2;
        empleados[2] = emp3;

        for (int i=0; i<empleados,length; i++) {
            
        }

         
        double sumaHoras = 0;
        for (int i = 0; i < empleados.length; i++) {
            sumaHoras += empleados[i].getHoras();
        }
        double promedioHoras = sumaHoras / empleados.length;

        for (int i = 0; i < empleados.length; i++) {
            Empleado empleadoActual = empleados[i];
            System.out.println("Empleado " + (i + 1) + ": " + empleadoActual.getNombre() + " Horas trabajadas: " + empleadoActual.getHoras() + " Se le pagara: " + (empleadoActual.getHoras() * 50) + " Pesos");
        }
        System.out.printf("promedio de horas trabajadas: %.2f", promedioHoras);
    }
    
}
