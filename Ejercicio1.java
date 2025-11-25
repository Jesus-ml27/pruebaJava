// Maerinez Lopez Jesus
/*  El programa presenta una exepción  de ejecucion al intentar acceder a una posicion que no existe en el arreglo.
  (java.lang.ArrayIndexOutOfBoundsException)*/


public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        System.out.println(numeros[0]);
        System.out.println(numeros[4]);

    }
}