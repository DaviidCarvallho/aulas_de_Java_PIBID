package trycatch;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println(100 / numero);

        } catch (NumberFormatException e) {
            System.out.println("Digite um número válido.");

        } /*catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }*/

        sc.close();

    }
}