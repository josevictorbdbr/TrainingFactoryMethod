public class Cachorro extends Animal {

    private boolean vacinado;

    public Cachorro(String nome, int idade, boolean vacinado) {
        super(nome, idade);
        this.vacinado = vacinado;
    }

    @Override
    public double calcularCusto() {
        double custo = 120.0;

        if (getIdade() > 10) {
            custo += 50.0;
        }

        return custo;
    }

    @Override
    public boolean precisaVacina() {
        return !vacinado;
    }

    @Override
    public String cuidados() {
        return "Passeio diario e vacinacao anual.";
    }
}