package Padroes_de_projeto.Decorator;

import Padroes_de_projeto.Decorator.ingredientes.Frango;
import Padroes_de_projeto.Decorator.ingredientes.Molho;
import Padroes_de_projeto.Decorator.ingredientes.Queijo;

public class Pizzaria {
    public static void main(String[] args) {
        // Criando uma pizza básica
        Pizza pizzaBasica = new PizzaBasica();
        pizzaBasica.adicionaMassa();
        
        // Criando decoradores para os ingredientes
        Molho pizzaComMolho = new Molho(pizzaBasica);
        Frango pizzaComMolhoEFrango = new Frango(pizzaComMolho);
        Queijo pizzaCompleta = new Queijo(pizzaComMolhoEFrango);
        
        // Adicionando os ingredientes
        pizzaComMolho.adicionarEsteIngrediente();
        pizzaComMolhoEFrango.adicionarEsteIngrediente();
        pizzaCompleta.adicionarEsteIngrediente();
        
        System.out.println(pizzaCompleta.getDescricao());
        double precoTotal = pizzaCompleta.getPrecoTotal();
        System.out.println("O valor total da pizza é: R$ " + precoTotal);
        
        System.out.println("Preço base: R$ 20,00");
        System.out.println("Molho: R$ 5,00");
        System.out.println("Frango: R$ 10,00");
        System.out.println("Queijo: R$ 8,00");
        System.out.println("Total: R$ " + precoTotal);
    }
}