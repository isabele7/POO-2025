package Padroes_de_projeto.Strategy;

/* Todas as estratégias de rota devem implementar essa interface */
public interface RouteStrategy {
    Route calculateRoute(String origin, String destination, RouteConditions conditions);
}
