package Padroes_de_projeto.Decorator.ingredientes;
import Padroes_de_projeto.Decorator.Pizza;
import Padroes_de_projeto.Decorator.IngredienteDecorator;

public class Frango extends IngredienteDecorator {
    public Frango(Pizza pizza) {
        super(pizza, "frango", 10.00);
    }
}