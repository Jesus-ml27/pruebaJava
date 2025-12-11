// Martinez lopez Jesus Edreix
// Se crea un metodo que reciba un arreglo de enteros y regrese el promedio de esos numeros

public class Promedio {

    public static double promedio(int [] n) {
        double suma=0;
        for(int i=0;i<n.length;i++) {
            suma+=n[i];
        }
        return suma/n.length;
    }
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};
        System.out.println("El promedio es: "+promedio(numeros));
    }
}
