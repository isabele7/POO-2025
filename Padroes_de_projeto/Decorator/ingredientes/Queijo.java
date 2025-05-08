package Padroes_de_projeto.Decorator.ingredientes;
import Padroes_de_projeto.Decorator.Pizza;
import Padroes_de_projeto.Decorator.IngredienteDecorator;

public class Queijo extends IngredienteDecorator {
    public Queijo(Pizza pizza) {
        super(pizza, "queijo", 8.00);
    }
}