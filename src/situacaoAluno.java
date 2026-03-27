import java.util.Scanner;

public class situacaoAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        System.out.print("Frequência (%): ");
        double frequencia = sc.nextDouble();

        String situacao;

        if (frequencia < 75) {
            situacao = "Reprovado (por frequência)";
        } else if (nota >= 7) {
            situacao = "Aprovado";
        } else if (nota >= 5 && nota <= 6.9) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado (por nota)";
        }

        System.out.println("Situação: " + situacao);

        sc.close();
    }
}
