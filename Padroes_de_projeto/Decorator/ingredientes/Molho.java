package Padroes_de_projeto.Decorator.ingredientes;
import Padroes_de_projeto.Decorator.Pizza;
import Padroes_de_projeto.Decorator.IngredienteDecorator;

public class Molho extends IngredienteDecorator {
    public Molho(Pizza pizza) {
        super(pizza, "molho", 5.00);
    }
}