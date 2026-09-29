public abstract class Atendimento {

    protected abstract Animal criarAnimal(
        String nome,
        int idade
    );

    public final void realizarAtendimento(
        String nome,
        int idade
    ) {
        Animal animal = criarAnimal(nome, idade);

        System.out.println("=== Atendimento ===");
        System.out.println(animal.resumo());
        System.out.println();
    }
}