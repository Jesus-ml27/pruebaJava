// Martinez lopez Jesus Edreix
// Se crea un metodo que reciba un arreglo de enteros y regrese la cantidad de numeros positivos en el arreglo

public class Positivos {
    public static int positivos(int[] n)
    {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String[]args)
    {
        int[] numeros={-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println("La cantidad de numeros positivos es: "+positivos(numeros));
    }
}
