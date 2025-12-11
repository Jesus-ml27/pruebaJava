//  Martines Lopez Jesus Edreix
//  Metodo que recibe un valor entero y regrese si es par o impar
public class UsaPares {
    public static String par(int n)
    {
        if(n%2==0)
        {
            return "Es par";
        }
        else
        {
            return "Es Impar";
        }
    }
    public static void main(String[]args)
    {
        int numero=2;
        System.out.println(par(numero));
    }
 }

