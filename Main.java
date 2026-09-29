public class Main {

    public static void main(String[] args) {

        Atendimento atendimento;

        atendimento = new AtendimentoCachorro();
        atendimento.realizarAtendimento("Rex", 5);

        atendimento = new AtendimentoGato();
        atendimento.realizarAtendimento("Mimi", 3);

        atendimento = new AtendimentoAve();
        atendimento.realizarAtendimento("Loro", 7);
    }
}