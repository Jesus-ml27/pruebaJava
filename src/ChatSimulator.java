import java.util.Scanner;

public class ChatSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🤖 Bienvenido al Simulador de Mensajes!");
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("\nHola " + nombre + ", soy el bot de VS Code!");
        System.out.println("Vamos a conversar un poco.");

        // Llama a la función para iniciar la conversación
        iniciarConversacion(nombre);
    }

    public static void iniciarConversacion(String nombre) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n¿Cómo te sientes programando hoy? ");
        String respuesta = sc.nextLine();

        // Según la respuesta del usuario, mostrar diferentes mensajes
        if (respuesta.contains("bien") || respuesta.contains("feliz")) {
            System.out.println("¡Excelente! Programar con VS Code mejora aún más ese ánimo 😄");
        } else if (respuesta.contains("mal")) {
            System.out.println("No te preocupes, ¡VS Code te hará la vida más fácil! 💪");
        } else {
            System.out.println("Interesante... ¡cada día se aprende algo nuevo! 🚀");
        }

        // Pide que el alumno agregue otro mensaje final de despedida
        System.out.println("\nGracias por probar VS Code, " + nombre + "!");
    }
}
