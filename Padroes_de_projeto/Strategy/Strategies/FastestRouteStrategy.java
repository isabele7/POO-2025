package Padroes_de_projeto.Strategy.Strategies;

import Padroes_de_projeto.Strategy.Route;
import Padroes_de_projeto.Strategy.RouteConditions;
import Padroes_de_projeto.Strategy.RouteStrategy;

public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String origin, String destination, RouteConditions conditions) {
        // Base values (simulated)
        double baseTime = 30.0; // 30 minutes
        double baseDistance = 10.0; // 10 km
        double baseCost = 25.0; // R$ 25
        double baseCO2 = 2.5; // 2.5 kg CO2

        // Adjust time based on conditions
        double timeMultiplier = 1.0;
        
        // Traffic impact
        switch (conditions.getTraffic()) {
            case LOW: timeMultiplier *= 1.0; break;
            case MEDIUM: timeMultiplier *= 1.3; break;
            case HIGH: timeMultiplier *= 1.6; break;
            case HEAVY: timeMultiplier *= 2.0; break;
        }

        // Weather impact
        switch (conditions.getWeather()) {
            case SUNNY: timeMultiplier *= 1.0; break;
            case CLOUDY: timeMultiplier *= 1.1; break;
            case RAINY: timeMultiplier *= 1.3; break;
            case STORMY: timeMultiplier *= 1.5; break;
        }

        // Transport type impact
        switch (conditions.getTransportType()) {
            case CAR: timeMultiplier *= 1.0; break;
            case BUS: timeMultiplier *= 1.4; break;
            case BIKE: timeMultiplier *= 2.0; break;
            case WALK: timeMultiplier *= 3.0; break;
        }

        // Calculate final values
        double finalTime = baseTime * timeMultiplier;
        double finalDistance = baseDistance;
        double finalCost = baseCost * (conditions.getTransportType() == RouteConditions.TransportType.CAR ? 1.0 : 0.5);
        double finalCO2 = baseCO2 * (conditions.getTransportType() == RouteConditions.TransportType.CAR ? 1.0 : 0.3);

        return new Route(origin, destination, finalTime, finalDistance, finalCost, finalCO2);
    }
}
