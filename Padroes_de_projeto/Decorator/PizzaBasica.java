package Padroes_de_projeto.Decorator;

/* Implementação da pizza básica */

public class PizzaBasica implements Pizza {
    private double precoTotal = 20.00; // Preço base da pizza
    private final StringBuilder ingredientes = new StringBuilder();
    
    @Override
    public void adicionaMassa() {
        System.out.println("Adicionando massa da pizza básica");
        ingredientes.append("Massa");
    }
    
    @Override
    public void adicionaIngrediente(String ingrediente) {
        if (ingredientes.length() > 0) {
            ingredientes.append(", ");
        }
        ingredientes.append(ingrediente);
        System.out.println("Adicionando " + ingrediente);
    }
    
    @Override
    public double getPrecoTotal() {
        return precoTotal;
    }
    
    @Override
    public String getDescricao() {
        return "Pizza com: " + ingredientes.toString();
    }
} 
