package Padroes_de_projeto.Decorator;

/* Interface base para todas as pizzas*/
public interface Pizza {
    void adicionaMassa();
    void adicionaIngrediente(String ingrediente);
    double getPrecoTotal();
    String getDescricao();
}