public class Ave extends Animal {

    private boolean exameRealizado;

    public Ave(String nome, int idade, boolean exameRealizado) {
        super(nome, idade);
        this.exameRealizado = exameRealizado;
    }

    @Override
    public double calcularCusto() {
        double custo = 80.0;

        if (getIdade() > 5) {
            custo += 30.0;
        }

        return custo;
    }

    @Override
    public boolean precisaVacina() {
        return !exameRealizado;
    }

    @Override
    public String cuidados() {
        return "Gaiola limpa e alimentacao adequada.";
    }
}