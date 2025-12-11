/*  Martinez Lopez Jesus
 Escribe un programa que almacene en un arreglo la denominacion de billetes
y monedas (1000, 500, 200, 100, 50, 20, 10, 5, 2, 1) lee de teclado una 
cantidad y procesa número de billetes y monedas de cada denominacion 
para tal cantidad*/

import java.util.Scanner;

public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

       int [] dinero = {1000,500,200,100,50,20,10,5,2,1};
        System.out.println("ingrese una cantidad de dinero: ");
        int cantidad=sc.nextInt();
        sc.close();
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