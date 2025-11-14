import java.util.Scanner;
import java.util.ArrayList;

public class ConversorMonedas {

    static ArrayList<String> nombresMonedas = new ArrayList<>();
    static ArrayList<Double> tasasCambioUSD = new ArrayList<>();

    static {
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
        for (int i = 0; i < nombresMonedas.size(); i++) {
            System.out.println((i + 1) + ". " + nombresMonedas.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado;
        double cantidad;
        int opcionSalir;
        int opcOrigen;
        int opcDestino;
        int opcSalir;
        double op;
        boolean continuar = true;

        do {
            do
            {
            imprimirMenuMonedas("Seleccione una opcion ");
            opcionSalir = nombresMonedas.size() + 1;
            System.out.println(opcionSalir + ". Salir ");
            System.out.print("Elija una opcion: ");

            opcOrigen = sc.nextInt();

            if (opcOrigen == opcionSalir) {
                continuar = false;
                System.out.println("Vuelva Pronto!");
            }

            if (opcOrigen < 1 || opcOrigen > nombresMonedas.size() + 1) {
                System.out.println("ERROR: DATO INCORRECTO ");
                System.out.println("Vuelva a intentarlo");
                    System.out.println("");
            }
            }while(opcOrigen < 1 || opcOrigen > nombresMonedas.size()+ 1);

            if (continuar) {
                do
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

                if (opcDestino < 1 || opcDestino > nombresMonedas.size()+ 1) {
                    System.out.println("Error: Dato incorreto ");
                    System.out.println("Vuelva a intentarlo");
                    System.out.println("");
                }
                }while(opcDestino < 1 || opcDestino > nombresMonedas.size()+ 1);

                if (continuar) {
                    System.out.println("");
                    System.out.print("Ingrese la cantidad a convertir: ");
                    cantidad = sc.nextDouble();
                    op = cantidad * tasasCambioUSD.get(opcOrigen - 1);
                    resultado = op / tasasCambioUSD.get(opcDestino - 1);

                    


                    System.out.printf("%.2f en %s a %s son: %.2f ", cantidad, (nombresMonedas.get(opcOrigen - 1)), (nombresMonedas.get(opcDestino - 1)), resultado);

                    do {
                        System.out.println("");
                        System.out.println("¿Desea hacer otra conversion?");
                        System.out.println("1.SI");
                        System.out.println("2.NO");

                        opcSalir = sc.nextInt();

                        if (opcSalir != 1 && opcSalir != 2) {
                            System.out.println("ERROR: Esa opcion no existe");
                            System.out.println("Vuelva a intentarlo");
                            System.out.println("");
                        }
                    } while (opcSalir != 1 && opcSalir != 2);

                    if (opcSalir == 2) {
                        continuar = false;
                        System.out.println("Vuelva Pronto!");
                    }
                
                    
                }
            }

        } while (continuar);

        sc.close();
        
    }
}


