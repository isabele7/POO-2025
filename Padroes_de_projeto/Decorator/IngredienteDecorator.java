package Padroes_de_projeto.Decorator;

/* Decorador base para ingredientes */

public class IngredienteDecorator extends PizzaDecorator {
    private final String ingrediente;
    private final double preco;
    private boolean ingredienteAdicionado = false;
    
    public IngredienteDecorator(Pizza pizza, String ingrediente, double preco) {
        super(pizza);
        this.ingrediente = ingrediente;
        this.preco = preco;
    }
    
    public void adicionarEsteIngrediente() {
        if (!ingredienteAdicionado) {
            pizza.adicionaIngrediente(ingrediente);
            ingredienteAdicionado = true;
        }
    }
    
    @Override
    public double getPrecoTotal() {
        return pizza.getPrecoTotal() + (ingredienteAdicionado ? preco : 0);
    }
}