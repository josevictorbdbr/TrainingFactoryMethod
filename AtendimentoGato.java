public class AtendimentoGato extends Atendimento {

    @Override
    protected Animal criarAnimal(String nome, int idade) {
        return new Gato(nome, idade, true);
    }
}