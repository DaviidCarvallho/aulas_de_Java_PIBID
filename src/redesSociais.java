public class redesSociais {

    public static void main(String[] args) {

        // 1. Array com horas de uso em 5 dias
        int[] horas = {2, 3, 4, 5, 6};

        int total = 0;

        // Inicializando menor e maior com o primeiro valor do array
        //int menor = horas[0];
        //int maior = horas[0];

        System.out.println("Horas de uso por dia:");

        // 2. Percorrendo o array
        for (int i = 0; i < horas.length; i++) {

            // Mostrando as horas de cada dia
            System.out.println("Dia " + (i + 1) + ": " + horas[i] + " horas");

            // 3. Somando as horas
            total += horas[i];

            // 6. Extra: verificando menor valor
            //if (horas[i] < menor) {
             //   menor = horas[i]; // atualiza o menor
            //}

            // 6. Extra: verificando maior valor
            //if (horas[i] > maior) {
            //    maior = horas[i]; // atualiza o maior
            //}
        }

        // 4. Mostrando o total
        System.out.println("\nTotal de horas: " + total);

        // 5. Verificação (opcional)
        if (total <= 15) {
            System.out.println("Uso moderado");
        } else {
            System.out.println("Uso excessivo");
        }

        // 6. Exibindo menor e maior valor
        //System.out.println("Menor uso: " + menor + " horas");
        //System.out.println("Maior uso: " + maior + " horas");
    }
}