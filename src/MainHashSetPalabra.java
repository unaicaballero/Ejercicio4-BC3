import java.util.HashSet;
import java.util.Scanner;

public class MainHashSetPalabra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> palabrasUnicas = new HashSet<>();

        System.out.print("¿Cuántas palabras quieres introducir? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine();

            palabrasUnicas.add(palabra);
        }

        System.out.println("Palabras únicas introducidas: ");
        for (String palabra : palabrasUnicas) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}
