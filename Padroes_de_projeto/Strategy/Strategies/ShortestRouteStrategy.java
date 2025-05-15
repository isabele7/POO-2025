package Padroes_de_projeto.Strategy.Strategies;

import Padroes_de_projeto.Strategy.Route;
import Padroes_de_projeto.Strategy.RouteConditions;
import Padroes_de_projeto.Strategy.RouteStrategy;

public class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String origin, String destination, RouteConditions conditions) {
        // Base values (simulated)
        double baseTime = 30.0; // 30 minutes
        double baseDistance = 12.0; // 12 km
        double baseCost = 35.0; // R$ 35
        double baseCO2 = 2.0; // 2.0 kg CO2

        // Adjust distance based on conditions
        double distanceMultiplier = 1.0;
        
        // Traffic impact on route choice
        switch (conditions.getTraffic()) {
            case LOW: distanceMultiplier *= 1.0; break;
            case MEDIUM: distanceMultiplier *= 1.1; break;
            case HIGH: distanceMultiplier *= 1.2; break;
            case HEAVY: distanceMultiplier *= 1.3; break;
        }

        // Transport type impact
        switch (conditions.getTransportType()) {
            case CAR: distanceMultiplier *= 1.0; break;
            case BUS: distanceMultiplier *= 1.2; break;
            case BIKE: distanceMultiplier *= 0.9; break;
            case WALK: distanceMultiplier *= 0.8; break;
        }

        // Calculate final values
        double finalTime = baseTime;
        double finalDistance = baseDistance * distanceMultiplier;
        double finalCost = baseCost;
        double finalCO2 = baseCO2;

        return new Route(origin, destination, finalTime, finalDistance, finalCost, finalCO2);
    }
}
