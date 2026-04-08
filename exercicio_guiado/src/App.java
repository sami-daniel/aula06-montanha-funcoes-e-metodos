
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.println("Digite o seguno numero: ");
        int b = scanner.nextInt();

        int maior = maior(a, b);

        System.out.println("O maior numero é: " + maior);

        scanner.close();
    }

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }
}
