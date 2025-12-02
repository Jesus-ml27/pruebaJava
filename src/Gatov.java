// Martinez Lopez Jesus Edreix
// Perez Ortiz Jorge Mauricio
//  Proyecto unidad 4 Juego de el gato usando matrices 


import java.util.Scanner;

public class Gatov {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        
        char[][] tablero = new char[3][3]; // Se crea el tablero con una matri1z 3x3
        
        for (int i = 0; i < 3; i++) { // Ciclo para inicializar el tablero con espacios vacíos
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' '; 
            }
        }

        // Declaracion de variables globales

        String eleccion = "";
        char jugadorActual; 
        int c=0; // contador para las combinaciones ganadoras

        do { // Ciclo para validar que los jugadores elijan entre X o 0
            System.out.println("Jugador 1 elige: X o 0");
            eleccion = dato.nextLine().toUpperCase();
            if (!eleccion.equals("X") && !eleccion.equals("0")) {
                System.out.println("Elección inválida. Por favor elige X o 0.");
            }
            
        } while (!eleccion.equals("X") && !eleccion.equals("0"));

        if (eleccion.equals("X")) { // Condicion para asignar el primer turno al jugador 
            jugadorActual = 'X';
        } else {
            jugadorActual = '0'; 
        }

        boolean hayGanador = false; // Variable booleana para controlar el ciclo del juego
        int movimientos = 0;  // contador de movimientos del juego

        System.out.println("    COMIENZA EL JUEGO    ");

        while (!hayGanador && movimientos < 9) { /*  Ciclo principa del juego el cual termina cuando hay un ganador
                                                     o se llenan las 9 casillas del tablero */

            System.out.println("\nTablero actual:");
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println("\n-------------");
            }

            int fila = -1;
            int col = -1;
            boolean casillaValida = false;

            do { // Ciclo para validar que la casilla elegida esté dentro del rango y no esté ocupada
                System.out.println("Turno de jugador " + jugadorActual);
                
                
                do { // Validacion para las filas 
                    System.out.print("Elige fila (1, 2, 3): ");
                    fila = dato.nextInt();
                    if(fila < 1 || fila > 3) System.out.println("Fila inválida!");
                } while (fila < 1 || fila > 3);

                
                do { // Validacion para las columnas
                    System.out.print("Elige columna (1, 2, 3): ");
                    col = dato.nextInt();
                    if(col < 1 || col > 3) System.out.println("Columna inválida!");
                } while (col < 1 || col > 3);
                
                
                int indiceFila = fila - 1;
                int indiceCol = col - 1;

                if (tablero[indiceFila][indiceCol] == ' ') { // Verifica si la casilla está vacía
                    casillaValida = true;
                } else {
                    System.out.println("Esa casilla ya está ocupada, Elige otra.");
                }
                
                

            } while (!casillaValida);

            
           
            tablero[fila - 1][col - 1] = jugadorActual;
            movimientos++; 


            int contador; 
            
            for (int i = 0; i < 3; i++) { // Ciclo para determinar si hay un ganador en las filas
                contador = 0; 
                for (int j = 0; j < 3; j++) {
                    
                    if (tablero[i][j] == jugadorActual) {
                        contador++;
                    }
                }
                
                if (contador == 3) {
                    hayGanador = true;
                }
            }

            
            for (int j = 0; j < 3; j++) { // Ciclo para determinar si hay un ganador en las columnas
                contador = 0; 
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][j] == jugadorActual) {
                        contador++;
                    }
                }
                if (contador == 3) {
                    hayGanador = true;
                }
            }

            
            contador = 0;
            for (int i = 0; i < 3; i++) { // Ciclo para determinar si hay un ganador en las diagonales
                if (tablero[i][i] == jugadorActual) {
                    contador++;
                }
            }
            if (contador == 3) {
                hayGanador = true;
            }

            
            contador = 0;
            for (int i = 0; i < 3; i++) { // Ciclo para determinar si hay un ganador en las diagonales invertidas
                if (tablero[i][2 - i] == jugadorActual) {
                    contador++;
                }
            }
            if (contador == 3) {
                hayGanador = true;
            }
            
            
            
            if (hayGanador) { // condiicon que determina si hay un ganador 
                System.out.println("\n FELICIDADES JUGADOR " + jugadorActual + ", HAS GANADO !");
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[i][j] + " | ");
                    }
                    System.out.println("\n-------------");
                }
            } else if (movimientos == 9) { // Condicion que determina si hay un empate
                System.out.println("\n EMPATE! Se acabó el tablero.");
            } else {
                if (jugadorActual == 'X') {
                    jugadorActual = '0';
                } else {
                    jugadorActual = 'X';
                }
            }
        }

    }
}
