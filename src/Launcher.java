import java.util.Scanner;
import java.util.InputMismatchException;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("Bienvenue dans ce premier projet.");
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Entrez votre commande : ");
                String cmd = scanner.nextLine();
                if ("quit".equals(cmd)){
                    running = false;
                }
                else{
                    System.out.println("Unknown command");
                }
            } catch (InputMismatchException e) {
                System.out.println("Unknown command");
            }
        }while(running);
    }
}