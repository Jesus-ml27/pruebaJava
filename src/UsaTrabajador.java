import java.util.Scanner;
public class UsaTrabajador {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        double promedio;
        double suma=0;
        String maxtrabajador="";
        Trabajador[] trabajadores = new Trabajador[3];
 
        for (i = 0; i < trabajadores.length; i++) {
            System.out.print("Dame el nombre del trabajador: ");
            String nombre=sc.nextLine();
            System.out.print("Horas trabajadas por "+nombre+": ");
            int horas=sc.nextInt();
            System.out.print("Sexo (f/m): ");
            char sexo=sc.next().charAt(0);
            sc.nextLine();
            Trabajador trabajador=new Trabajador(nombre,horas,sexo);
            trabajadores[i]=trabajador;
        }

        sc.close();

        int max = -1;
        for(i=0;i<trabajadores.length;i++){
            Trabajador trabajadoractual=trabajadores[i];
            if(trabajadoractual.getHoras()>max){
                max=trabajadoractual.getHoras();
                maxtrabajador=trabajadoractual.getNombre();
            }
        }
            for(i=0;i<trabajadores.length;i++){
            Trabajador trabajadoractual=trabajadores[i];
                suma=suma+trabajadoractual.getHoras(); 
            }  
            
            for(i=0;i<trabajadores.length;i++){
                Trabajador trabajadoractual=trabajadores[i];
                int sueldo=trabajadoractual.getHoras()*100;
                System.out.println("Trabajador "+(i+ 1));
                if(trabajadoractual.getSexo()=='f'){
                    sueldo=sueldo+500;
                    System.out.println("Tiene un bono de 500 pesos por ser mujer.");
                    System.out.println("Nombre: "+trabajadoractual.getNombre()+": Horas trabajadas: "+trabajadoractual.getHoras()+", Sueldo a pagar: "+sueldo+" pesos");
                    System.out.println("");
                }else if(trabajadoractual.getSexo()=='m'){
                    sueldo=sueldo+200;
                    System.out.println("Tiene un bono de 200 pesos por ser hombre.");
                    System.out.println("Nombre: "+trabajadoractual.getNombre()+": Horas trabajadas: "+trabajadoractual.getHoras()+", Sueldo a pagar: "+sueldo+" pesos");
                    System.out.println("");
                }
                
            }
            promedio=suma/trabajadores.length;
            System.out.println("");
            System.out.println("*****Resultados*****");
            for(i=0;i<trabajadores.length;i++){
                Trabajador trabajadoractual=trabajadores[i];
                if(trabajadoractual.getHoras()>promedio)
                  System.out.println("Trabajador que trababajo mas que el promedio: "+trabajadoractual.getNombre());
            }
            System.out.println("El trabajador que más horas trabajó fue: "+maxtrabajador);
            System.out.printf("El promedio de horas trabajadas es: %.2f\n",promedio);
            
            sc.close();
        }
    }