import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("¡Hola mundo desde GitHub Codespaces! 👋");

        while (numero != 5) {
            System.out.println("ingresa una numero: ");
         numero = sc.nextInt();
        }
        sc.close();
    }
}