// Martinez Lopez Jesus Edreix
/*Define dos arreglos, nombre de empleados y horas trabajadas. 
Almacena datos en cada uno de ellos. Obtén dos arreglos más, 
uno para impuesto y otro para el sueldo de cada empleado. 
Cada hora de trabajo normal (40 horas) se paga a $15, cada 
hora extra (>40) se paga a $20. El impuesto es igual al 6%. 
Obtén el total de sueldos pagados y un listado de la siguiente 
forma:
Nombre Horas Sueldo_Bruto Impuesto Sueldo_Neto */

public class Ejercicio6 {
    public static void main(String[]args) {
      String[] empleados= {"Miguel","Luis","Sofia","Carlos","Ana"};
      int[] horasTrabajadas= {140,185,173,153,150};  
      double[] impuestos=new double[5];
      int horasextras=0;
      double[] pagos=new double[5];

      for(int i=0;i<empleados.length;i++) {

            if(horasTrabajadas[i]>=0 && horasTrabajadas[i]<=40) {

              pagos[i]=horasTrabajadas[i]*15;
            }
            else {

                horasextras=horasTrabajadas[i]-40;
                pagos[i]=(40*15)+(horasextras*20);
                impuestos[i]=pagos[i]*.6;
            }
      }

      System.out.println("Nombre      Horas      Sueldo_Bruto    Impuestos     Sueldo_Neto");

      for(int i=0;i<empleados.length;i++) {
        
         System.out.printf("%-6s       %-6d       %-6.2f        %-6.2f       %-6.2f\n",empleados[i],horasTrabajadas[i],pagos[i],impuestos[i],(pagos[i]-impuestos[i]));
      }
    }
}
