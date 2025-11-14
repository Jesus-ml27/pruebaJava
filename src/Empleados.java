public class Empleados {
    public static void main(String[] args) {
		int i;
		double suma = 0;
		int c=0;
		double promedio=0;
		Empleado[] empleados = new Empleado[3];
		empleados[0] = new Empleado("Pedro", 1);
		empleados[1] = new Empleado("Ana", 3);
		empleados[2] = new Empleado("Juan", 6);

		System.out.println("Longitud de la array: " + empleados.length);
		for (i = 0; i < empleados.length; i++) {
			Empleado empleadoactual = empleados[i];
			suma = suma + empleadoactual.getHoras();
		}

		for (i = 0; i < empleados.length; i++) {
			Empleado empleadoactual = empleados[i];
			promedio= suma / empleados.length;
			System.out.println("Empleado " + (i + 1) + ": " + empleadoactual.getNombre() + " Horas trabajadas: " + empleadoactual.getHoras() + " Se le pagara: " + (empleadoactual.getHoras() * 50) + " Pesos");
			if(empleadoactual.getHoras()>promedio){
				c++;
			}
		}
		System.out.printf("promedio de horas trabajadas: %.2f\n", promedio);
		System.out.printf("Cantidad de empleados que superan el promedio de horas trabajadas: %d\n", c);

		
	}
}
