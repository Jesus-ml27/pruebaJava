import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;


        System.out.println("¡Hola mundo desde GitHub Codespaces! 👋");

        // El programa terminará cuando se ingrese el número 3
        while (numero != 3) {
            System.out.println("Ingresa un número (escribe 3 para salir): ");
            numero = sc.nextInt();
        }
        sc.close();
    }
}