public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract double calcularCusto();

    public abstract boolean precisaVacina();

    public abstract String cuidados();

    public String resumo() {
        return "Animal: " + nome +
               "\nIdade: " + idade +
               "\nCusto: R$ " + calcularCusto() +
               "\nPrecisa de vacina: " + (precisaVacina() ? "Sim" : "Nao") +
               "\nCuidados: " + cuidados();
    }
}