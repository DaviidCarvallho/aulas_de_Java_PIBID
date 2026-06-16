package construtorsgeteset;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto Usuario utilizando o construtor
        Usuario usuario = new Usuario(
                "Maria Silva",
                17,
                "Garanhuns",
                "Estudante de Informática"
        );

        // Exibindo as informações utilizando os métodos GET
        System.out.println("=== PERFIL INICIAL ===");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Cidade: " + usuario.getCidade());
        System.out.println("Biografia: " + usuario.getBiografia());

        // Alterando algumas informações utilizando os métodos SET
        usuario.setCidade("Recife");
        usuario.setBiografia("Apaixonada por programação");

        // Exibindo os dados atualizados
        System.out.println("\n=== PERFIL ATUALIZADO ===");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Cidade: " + usuario.getCidade());
        System.out.println("Biografia: " + usuario.getBiografia());
    }
}