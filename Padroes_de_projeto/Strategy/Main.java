package Padroes_de_projeto.Strategy;

import Padroes_de_projeto.Strategy.Strategies.CheapestRouteStrategy;
import Padroes_de_projeto.Strategy.Strategies.EcoFriendlyStrategy;
import Padroes_de_projeto.Strategy.Strategies.FastestRouteStrategy;
import Padroes_de_projeto.Strategy.Strategies.ShortestRouteStrategy;

public class Main {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();
        String origin = "Av. Paulista";
        String destination = "USP";

        // Criando diferentes condições para teste
        RouteConditions sunnyLowTraffic = new RouteConditions(
            RouteConditions.WeatherCondition.SUNNY,
            RouteConditions.TrafficCondition.LOW,
            RouteConditions.TransportType.CAR
        );

        RouteConditions rainyHeavyTraffic = new RouteConditions(
            RouteConditions.WeatherCondition.RAINY,
            RouteConditions.TrafficCondition.HEAVY,
            RouteConditions.TransportType.BUS
        );

        // Testando a estratégia mais rápida
        System.out.println("\n=== Rota Mais Rápida (Dia Ensolarado, Tráfego Baixo) ===");
        planner.setStrategy(new FastestRouteStrategy());
        Route fastestRoute = planner.planRoute(origin, destination, sunnyLowTraffic);
        System.out.println(fastestRoute);

        // Testando a estratégia mais curta
        System.out.println("\n=== Rota Mais Curta (Dia Ensolarado, Tráfego Baixo) ===");
        planner.setStrategy(new ShortestRouteStrategy());
        Route shortestRoute = planner.planRoute(origin, destination, sunnyLowTraffic);
        System.out.println(shortestRoute);

        // Testando a estratégia mais econômica
        System.out.println("\n=== Rota Mais Econômica (Dia Chuvoso, Tráfego Intenso) ===");
        planner.setStrategy(new CheapestRouteStrategy());
        Route cheapestRoute = planner.planRoute(origin, destination, rainyHeavyTraffic);
        System.out.println(cheapestRoute);

        // Testando a estratégia mais ecológica
        System.out.println("\n=== Rota Mais Ecológica (Dia Chuvoso, Tráfego Intenso) ===");
        planner.setStrategy(new EcoFriendlyStrategy());
        Route ecoRoute = planner.planRoute(origin, destination, rainyHeavyTraffic);
        System.out.println(ecoRoute);
    }
}