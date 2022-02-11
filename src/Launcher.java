import java.nio.file.Files;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;




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
                } else if ("freq".equals(cmd)) {
                    Scanner sc_path = new Scanner(System.in);
                    System.out.println("Entrer le chemin du ficher : ");
                    Path filePath = Paths.get(sc_path.nextLine());
                    String content = null;
                    try {
                        content = Files.readString(filePath);
                        content.replaceAll(",.;.:.?.!./..", " ");
                        System.out.println(content);
                    } catch (IOException e) {
                        System.out.println("Unreadable file: class Launcher; " + e);
                    }


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
