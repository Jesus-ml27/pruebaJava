import java.util.Scanner;

public class uiui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] denominaciones = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Ingresa la cantidad a procesar: ");
        int cantidad = scanner.nextInt();

        System.out.println("\nDesglose para $" + cantidad + ":");
        
       
        for (int i = 0; i < denominaciones.length; i++) {
            int valor = denominaciones[i];
            
            
            int cantidadBilletes = cantidad / valor;

           
            if (cantidadBilletes > 0) {
                System.out.println("$" + valor + ": " + cantidadBilletes);
                
                
                cantidad = cantidad % valor;
            }
        }   
      
    }
}