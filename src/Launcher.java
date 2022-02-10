import java.util.Scanner;
import java.util.InputMismatchException;

public class Launcher {
    public static void main(String[] args) {
        try {
            System.out.println("Bienvenue dans ce premier projet.");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez votre commande : ");
            String email = scanner.next("quit");
        } catch (InputMismatchException e) {

            System.out.println("Unknown command");
        }
    }
}