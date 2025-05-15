package Padroes_de_projeto.Strategy;

/* Classe RoutePlanner que utiliza o padrão Strategy para calcular rotas.
 * Permite definir diferentes estratégias de cálculo de rota (mais rápida, mais econômica, etc.).*/
public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String origin, String destination, RouteConditions conditions) {
        if (strategy == null) {
            throw new IllegalStateException("Estratégia de rota não definida");
        }
        return strategy.calculateRoute(origin, destination, conditions);
    }
}
