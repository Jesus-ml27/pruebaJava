// Martinez Lopez Jesus
/*  El programa calcula el desglose de cierta cantidad de dinero a partir de 
valores de los billetes que estan almacenados en un arreglo.*/

import java.util.Scanner;

public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

       int [] dinero = {1000,500,200,100,50,20,10,5,2,1};
        System.out.println("ingrese una cantidad de dinero: ");
        int cantidad=sc.nextInt();
        System.out.println("el desglose de $"+cantidad+" es: ");

        for(int i=0;i<dinero.length;i++)
        {
            int valor=dinero[i];
            int cantidadBilletes=cantidad/valor;
            if(cantidadBilletes>0)
            {
                System.out.println("$"+valor+": "+cantidadBilletes);
                cantidad=cantidad%valor;
            }
        }
    
    }

}