/*Martinez Lopez Jesus Edreix
  Escribe un programa que genere 500 números aleatorios (rango de 1 a 50) y obtenga como salida cuantas veces se repitió  cada número. */
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Random random=new Random();
        int[] numeros=new int[500];
        int[] repetidos=new int[51];

        // Llenar el arreglo con números aleatorios entre 1 y 50
        for(int i=0;i<numeros.length;i++){
            numeros[i]=random.nextInt(50) + 1;

        }
        // Contar repeticiones
        for (int num : numeros) {
            repetidos[num]++;
        }

        // imprimir resultados
        for (int i = 0; i < repetidos.length; i++)
            if(repetidos[i]>0)
                System.out.println("El número " + i + " aparece " + repetidos[i] + " veces.");
        }
    }
