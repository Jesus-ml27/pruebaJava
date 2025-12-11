/*Maerinez Lopez Jesus
  Escribe un programa que intente acceder en un arreglo un elemento que no existe (fuera del rango). ¿Qué sucede en la ejecución?*/


public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        System.out.println(numeros[0]);
        System.out.println(numeros[4]);

    }
}