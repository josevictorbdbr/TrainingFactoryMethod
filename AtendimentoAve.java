public class AtendimentoAve extends Atendimento {

    @Override
    protected Animal criarAnimal(String nome, int idade) {
        return new Ave(nome, idade, false);
    }
}