// Martinez Lopez Jesus Edreix
// Se crea un metodo que reciba un numero entero n y regrese el enesimo numero de la secuencia de Fibonacci

public class Fibonacci {    

public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
       
    }

     public static void main(String[] args) {
            int numero = 8; 
            System.out.println("El número Fibonacci en la posición " + numero + " es: " + fibonacci(numero));
        }
}