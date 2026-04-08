
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Insira a altura: ");
        double altura = leitor.nextDouble();

        double imc = calcularIMC(peso, altura);

        classificarIMC(imc);

        leitor.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void classificarIMC(double imc) {
        System.out.print("Classificação do Indice de massa corporal: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        } else {
            System.out.println("Obesidade grau 3 (morbida)");
        }
    }
}
