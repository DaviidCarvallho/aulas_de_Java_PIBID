package trycatch;
import java.util.Scanner;

public class tratamentodeexececoes {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
      try {
        int idade = Integer.parseInt(sc.nextLine());
        System.out.println("Idade: " + idade);
    } catch (NumberFormatException e) {
        System.out.println("Digite uma idade válida.");
    }
    }
}
