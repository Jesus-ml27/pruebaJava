// Martinez Lopez Jesus Edreix
// Perez Ortiz Jorge Mauricio
/*  .  */ 



import java.util.Scanner;

public class Gato {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        char[][] tablero = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' '; 
            }
        }

        String eleccion = "";
        char jugadorActual; 

        do {
            System.out.println("Jugador 1 elige: X o 0");
            eleccion = dato.nextLine().toUpperCase();
            if (!eleccion.equals("X") && !eleccion.equals("0")) {
                System.out.println("Elección inválida. Por favor elige X o 0.");
            }
            
        } while (!eleccion.equals("X") && !eleccion.equals("0"));

        if (eleccion.equals("X")) {
            jugadorActual = 'X';
        } else {
            jugadorActual = '0'; 
        }

        boolean hayGanador = false;
        int movimientos = 0; 

        System.out.println("    COMIENZA EL JUEGO    ");

        while (!hayGanador && movimientos < 9) {

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

            do {
                System.out.println("Turno de jugador " + jugadorActual);
                
                do {
                    System.out.print("Elige fila (0, 1, 2): ");
                    fila = dato.nextInt();
                    if(fila < 0 || fila > 2) System.out.println("Fila inválida!");
                } while (fila < 0 || fila > 2);

                do {
                    System.out.print("Elige columna (0, 1, 2): ");
                    col = dato.nextInt();
                    if(col < 0 || col > 2) System.out.println("Columna inválida!");
                } while (col < 0 || col > 2);

                if (tablero[fila][col] == ' ') {
                    casillaValida = true;
                } else {
                    System.out.println("Esa casilla ya está ocupada, Elige otra.");
                }

            } while (!casillaValida);

            tablero[fila][col] = jugadorActual;
            movimientos++; 

            if(tablero[0][0] == jugadorActual && tablero[0][1] == jugadorActual && tablero[0][2] == jugadorActual) hayGanador = true;
            
            if(tablero[1][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[1][2] == jugadorActual) hayGanador = true;

            if(tablero[2][0] == jugadorActual && tablero[2][1] == jugadorActual && tablero[2][2] == jugadorActual) hayGanador = true;
            
            if(tablero[0][0] == jugadorActual && tablero[1][0] == jugadorActual && tablero[2][0] == jugadorActual) hayGanador = true;

            if(tablero[0][1] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][1] == jugadorActual) hayGanador = true;
            
            if(tablero[0][2] == jugadorActual && tablero[1][2] == jugadorActual && tablero[2][2] == jugadorActual) hayGanador = true;
            
            if(tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) hayGanador = true;

            if(tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) hayGanador = true;

            if (hayGanador) {
                System.out.println("\n FELICIDADES JUGADOR " + jugadorActual + ", HAS GANADO !");
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[i][j] + " | ");
                    }
                    System.out.println("\n-------------");
                }
            } else if (movimientos == 9) {
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
