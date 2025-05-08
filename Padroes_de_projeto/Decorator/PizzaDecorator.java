package Padroes_de_projeto.Decorator;

/* Classe abstrata base para todos os decoradores */

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public void adicionaMassa() {
        pizza.adicionaMassa();
    }
    
    @Override
    public void adicionaIngrediente(String ingrediente) {
        pizza.adicionaIngrediente(ingrediente);
    }
    
    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
}