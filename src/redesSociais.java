public class redesSociais {

    public static void main(String[] args) {

        // 1. Criando um array com 5 posições (horas por dia)
        int[] horas = {2, 3, 4, 5, 6};

        // Variável para armazenar o total de horas
        int total = 0;

        System.out.println("Horas de uso por dia:");

        // 2. Percorrendo o array (for melhorado - mais moderno)
        for (int hora : horas) {

            // Exibindo o valor atual
            System.out.println(hora + " horas");

            // 3. Somando as horas
            total += hora;
        }

        // 4. Mostrando o total de horas
        System.out.println("\nTotal de horas: " + total);

        // 5. Verificação (parte opcional)
        // <= significa "menor ou igual"
        // > significa "maior que"
        if (total <= 15) {
            System.out.println("Uso moderado");
        } else {
            System.out.println("Uso excessivo");
        }
    }
}