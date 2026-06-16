package construtorsgeteset;

public class Usuario {

    // Atributos privados (encapsulamento)
    private String nome;
    private int idade;
    private String cidade;
    private String biografia;

    // Construtor responsável por criar o objeto já com seus dados
    public Usuario(String nome, int idade, String cidade, String biografia) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.biografia = biografia;
    }

    // Método GET para consultar o nome
    public String getNome() {
        return nome;
    }

    // Método SET para alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método GET para consultar a idade
    public int getIdade() {
        return idade;
    }

    // Método SET para alterar a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método GET para consultar a cidade
    public String getCidade() {
        return cidade;
    }

    // Método SET para alterar a cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método GET para consultar a biografia
    public String getBiografia() {
        return biografia;
    }

    // Método SET para alterar a biografia
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}