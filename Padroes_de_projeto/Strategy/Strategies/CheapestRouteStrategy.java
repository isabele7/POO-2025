package Padroes_de_projeto.Strategy.Strategies;

import Padroes_de_projeto.Strategy.Route;
import Padroes_de_projeto.Strategy.RouteConditions;
import Padroes_de_projeto.Strategy.RouteStrategy;

public class CheapestRouteStrategy implements RouteStrategy {
   public CheapestRouteStrategy() {
   }

   @Override
   public Route calculateRoute(String origin, String destination, RouteConditions conditions) {
      return new Route(origin, destination, 40.0, 20.0, 25.0, 2.8);
   }
}
