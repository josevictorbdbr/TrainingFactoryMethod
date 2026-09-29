public class Gato extends Animal {

    private boolean vacinado;

    public Gato(String nome, int idade, boolean vacinado) {
        super(nome, idade);
        this.vacinado = vacinado;
    }

    @Override
    public double calcularCusto() {
        double custo = 100.0;

        if (getIdade() > 10) {
            custo += 40.0;
        }

        return custo;
    }

    @Override
    public boolean precisaVacina() {
        return !vacinado;
    }

    @Override
    public String cuidados() {
        return "Alimentacao controlada e acompanhamento veterinario.";
    }
}