import java.util.Scanner;

public class correcaProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escreva sua solução aqui
       int numF = sc.nextInt();
			int horas = sc.nextInt();
			double valor_hora = sc.nextDouble();
			double salario = 0;
			if (horas > 40) {
				salario = 40 * valor_hora + (horas - 40) * valor_hora * 1.5;
			}else {
				salario = horas * valor_hora;
			}
			System.out.println("Ferreiro = " + numF);
			System.out.println("Salário = R$ " + salario + ".");
	        sc.close();
	}
    }
