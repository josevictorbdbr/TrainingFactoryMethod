public class AtendimentoCachorro extends Atendimento {

    @Override
    protected Animal criarAnimal(String nome, int idade) {
        return new Cachorro(nome, idade, false);
    }
}