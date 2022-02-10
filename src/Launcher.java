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
                if ("quit".equals(cmd)) {
                    running = false;
                } else if ("fibo".equals(cmd)) {
                    System.out.println("Entrez votre nombre: ");
                    String n = scanner.nextLine();
                    System.out.println(fibo(Integer.parseInt(n)));
                } else {
                    System.out.println("Unknown command");
                }
            } catch (InputMismatchException e) {
                System.out.println("Unknown command");
            }
        } while (running);


    }
    private static int fibo(int n) {
        if (n <= 1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
}
