import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (ehPar(numero)) {
            System.out.println("O numero " + numero + " é par.");
        } else {
            System.out.println("O numero " + numero + " é impar.");
        }

        leitor.close();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}
