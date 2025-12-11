// Martinez Lopez Jesus Edreix
/*  Escribe un programa que genere ventas aleatorias de tres productos (leche, pañales y cerveza) 
    para cada día del mes (30 días). Al final del mes, el programa debe mostrar:
    a) El día que hubo más ventas (Suma de las 3 ventas MAYOR).
    b) El día que hubo menos ventas de pañales.
    c) El total de ventas de cada producto en el mes.*/ 

import java.util.Random;
public class Ejercicio4 {
    public static void main(String[]args){
        Random rad=new Random();
        int[] leche=new int[31];
        int[] pañales=new int[31];
        int[] cerveza=new int[31];
        int[] sumatotaldia=new int[31];
        
        int max=-1;
        int men=0;
        int panmax=-1;
        int sumaleche=0;
        int sumacer=0;
        int sumapañ=0;
        int diamax=0;
        int sumamen=0;

        for(int i=0;i<cerveza.length;i++) {
            leche[i]=rad.nextInt(51);
            pañales[i]=rad.nextInt(51);
            cerveza[i]=rad.nextInt(51);
        }

        for(int i=0;i<leche.length;i++) {
            sumatotaldia[i]=leche[i]+pañales[i]+cerveza[i];
            sumaleche+=leche[i];
            sumacer+=cerveza[i];
            sumapañ+=pañales[i];
        }

        for(int i=0;i<sumatotaldia.length;i++) {
            if(sumatotaldia[i]>max) {
                diamax=i + 1;
                max=sumatotaldia[i];
            }
            if(pañales[i]>panmax){
                panmax=pañales[i];
                men=pañales[i];
            }
        }

        for(int i=0;i<sumatotaldia.length;i++){
            if(pañales[i]<men) {
                sumamen= i + 1;
                men=pañales[i];
            }
        }

        System.out.println("El dia que hubo mas ventas fue el dia "+diamax);

        System.out.println("El dia que hubo menos ventas de pañales fue el dia "+sumamen);

        System.out.println("Total de ventas de cada producto en el mes del producto leche: "+sumaleche);

        System.out.println("Total de ventas de cada producto en el mes del producto cerveza: "+sumacer);

        System.out.println("Total de ventas de cada producto en el mes del producto pañales: "+sumapañ);
    }
}
