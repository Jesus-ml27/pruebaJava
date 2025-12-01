/**************PROYECTO Conversor de monedas*************
 Menu para elegir alguna moneda a convertir(peso mexicano, dolar, yen,Euro, yuan, libra esterlina,etc...)*/
 
 /* Se importan las clases que se van a usar*/
import java.util.Scanner;
import java.util.ArrayList;

public class ConversorMonedas { /* Se crea una clase para el programa*/

    static ArrayList<String> nombresMonedas = new ArrayList<>();//Se declara la variable "nombresMonedas" como arraylist para guardar los nombres de las monedas en un arraylist*/
    static ArrayList<Double> tasasCambioUSD = new ArrayList<>();// Se declara la variable "tasasCambioUSD" como arraylist que guarde el precio de las monedas en dolar*/

    static {// Se añaden los datos de cada arralist en orden
        nombresMonedas.add("Dolar Estadounidense ");
        tasasCambioUSD.add(1.00);

        nombresMonedas.add("Euro ");
        tasasCambioUSD.add(1.16);

        nombresMonedas.add("Yen japones ");
        tasasCambioUSD.add(0.0065);

        nombresMonedas.add("Libra esterlina ");
        tasasCambioUSD.add(1.33);

        nombresMonedas.add("Franco suizo ");
        tasasCambioUSD.add(1.66);

        nombresMonedas.add("Yuan chino ");
        tasasCambioUSD.add(0.14);

        nombresMonedas.add("Dolar canadiense ");
        tasasCambioUSD.add(0.72);

        nombresMonedas.add("Dolar australiano ");
        tasasCambioUSD.add(0.65);

        nombresMonedas.add("Real brasileno ");
        tasasCambioUSD.add(0.19);

        nombresMonedas.add("Peso Mexicano ");
        tasasCambioUSD.add(0.054);
    }

    public static void imprimirMenuMonedas(String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < nombresMonedas.size(); i++) { /* Se usa un for, con la variable i en 0 y que el ciclo se repita mientras que la i se menor al tamaño de la arraylist "nombresMonedas"*/
            System.out.println((i+ 1) + ". " + nombresMonedas.get(i));/* Asigna el menu desde el 1 al tamaño de la arraylist y get para traer el elemento/dato en la posicion i de la arralist "nombresMonedas"*/
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);/* Se declara la variable sc como scanner para la lectura de datos*/
        double resultado;/* Declaracion de las variables que se usaran durante el programa*/
        double cantidad;
        int opcionSalir;
        int opcOrigen;
        int opcDestino;
        int opcSalir;
        double op;
        boolean continuar = true;// usamos una variable boleana  para controlar el bucle principal. Si se vuelve falsa el programa termina.

        do {
            /* Ciclo para la validacion de la variable opcOrigen*/
            do
            {
            imprimirMenuMonedas("Seleccione una opcion ");/* llama al metodo "imprimirMenuMonedas" e Imprime el menu de monedas*/
            opcionSalir = nombresMonedas.size() + 1;/* Se asgina la opcionSalir a la ultima posicion*/
            System.out.println(opcionSalir + ". Salir ");/* Se imprime la opcionSalir como otra opcion mas del menu*/
            System.out.print("Elija una opcion: ");

            opcOrigen = sc.nextInt();/* Variable para saber la opcion que elija el usuario*/

            if (opcOrigen == opcionSalir) {/* Si la opcOrigen es igual a la posicion de la opcionSalir entonces ejecuta lo siguiente*/
                continuar = false;/* La variable continuar se vuelve falsa y sale del programa con un mensaje de despedida*/
                System.out.println("Vuelva Pronto!");
            }

            if (opcOrigen < 1 || opcOrigen > nombresMonedas.size() + 1) {/* Si opcOrigen es diferente de las opciones permitidas
            da error y pide otra opcion*/
                System.out.println("ERROR: DATO INCORRECTO ");
                System.out.println("Vuelva a intentarlo");
                    System.out.println("");
            }
            }while(opcOrigen < 1 || opcOrigen > nombresMonedas.size()+ 1);/* Si opcOrigen es diferente a las opciones permitidas,
            repite de nuevo el bloque de instrucciones*/

            if (continuar) { // si opcOrigen es diferente de 11, el codigo se sigue ejecutando 
                do // ciclo para la validacion de la variable opcDestino
                {
                System.out.println("");
                imprimirMenuMonedas("Seleccione la moneda a la que se quiere convertir: ");
                System.out.println(opcionSalir + ". Salir ");
                System.out.print("Elija una opcion: ");
                opcDestino = sc.nextInt();

                if (opcDestino == opcionSalir) {
                    continuar = false;
                    System.out.println("Vuelva Pronto!");
                }

                if (opcDestino < 1 || opcDestino > nombresMonedas.size()+ 1) { // Si opcDestino es diferente de las opciones permitidas
                    System.out.println("Error: Dato incorreto ");
                    System.out.println("Vuelva a intentarlo");
                    System.out.println("");
                }
                }while(opcDestino < 1 || opcDestino > nombresMonedas.size()+ 1);

                if (continuar) { // si se cumplio la validacion de opcOrigen y opcDestino entonces se pedira la cantidad a convertir
                
                
                  
                    System.out.println("");
                    System.out.print("Ingrese la cantidad a convertir: ");
                    cantidad = sc.nextDouble();
                    op = cantidad * tasasCambioUSD.get(opcOrigen - 1); // se hacen los calculos aplicando una regla de 3. Se multiplica la cantidad por la moneda de origen
                    resultado = op / tasasCambioUSD.get(opcDestino - 1); // de divide el resultado por la equivalencia de la moneda(Destino) en dolares  



                    //Formato de salida para los resultados redondeado a 2 decimales 
                    System.out.printf("%.2f en %s a %s son: %.2f ", cantidad, (nombresMonedas.get(opcOrigen - 1)), (nombresMonedas.get(opcDestino - 1)), resultado);

                    do {  // se pregunta si se desea hacer otra conversion si se dice que si se repite el ciclo, si no se termina el programa 
                        System.out.println("");
                        System.out.println("¿Desea hacer otra conversion?");
                        System.out.println("1.SI");
                        System.out.println("2.NO");

                        opcSalir = sc.nextInt(); // se lee la opcSalir 

                        if (opcSalir != 1 && opcSalir != 2) { // se valida que el dato de entrada para opcSalir sea correcto
                            System.out.println("ERROR: Esa opcion no existe");
                            System.out.println("Vuelva a intentarlo");
                            System.out.println("");
                        }
                    } while (opcSalir != 1 && opcSalir != 2);

                    if (opcSalir == 2) { // si la opcion es 2, se sale del programa 
                        continuar = false;
                        System.out.println("Vuelva Pronto!");
                    }
                
                    
                }
            } 

        } while (continuar); // el ciclo termina cuando continuar se vuelva falso 
        sc.close();
    }
}