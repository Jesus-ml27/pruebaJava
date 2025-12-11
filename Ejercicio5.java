/*  Martinez Lopez Jesus Edreix
  Define dos arreglos, nombre de alumnos y calificaciones, almacena datos encada uno de ellos e imprime;
	a) listado de todos los alumnos que tienen calificacion mayor que el promedio0 del grupo.
	b) Listado de los alumnos reprobados(Calificacion menor a 70).
	c) Promedio del grupo 
	d)  nombre del alumno con  mayor calificación.*/
      
public class Ejercicio5 {
	public static void main(String[]args)
	{
		String[] alumnos= {"Pablo","Margo","Juliana","Melissa","Pedro"};
		int[] calificaciones= {40,80,90,100,70};
		double promedio=0;
		int max=-1;
		int al=0;

		for(int cal:calificaciones)
			promedio+=(cal)/calificaciones.length;

		System.out.println("Promedio del grupo: "+promedio);
		System.out.println("****Listado de los alumnos que reprobaron****");
		for(int i=0; i<alumnos.length; i++)
			if(calificaciones[i]<70)
			{
				System.out.println("\nAlumno: "+alumnos[i]);
				System.out.println("Calificacion: "+calificaciones[i]);
			}
		System.out.println("\n****Listado de los alumnos que tienen calificacion mayor que el promedio****");
		for(int i=0; i<alumnos.length; i++)
			if(calificaciones[i]>promedio)
			{
				System.out.println("\nAlumno: "+alumnos[i]);
				System.out.println("Calificacion: "+calificaciones[i]);
			}
		for(int i=0; i<alumnos.length; i++)
			if(calificaciones[i]>max)
			{
				max=calificaciones[i];
				al=i;
			}
		System.out.println("\nEl alumno con mejor calificacion es "+alumnos[al]+" con calificacion de: "+calificaciones[al]);



	}
}