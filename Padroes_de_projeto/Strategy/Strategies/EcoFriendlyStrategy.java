package Padroes_de_projeto.Strategy.Strategies;

import Padroes_de_projeto.Strategy.Route;
import Padroes_de_projeto.Strategy.RouteConditions;
import Padroes_de_projeto.Strategy.RouteStrategy;

public class EcoFriendlyStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String origin, String destination, RouteConditions conditions) {
        // Base values (simulated)
        double baseTime = 35.0; // 35 minutes
        double baseDistance = 18.0; // 18 km
        double baseCost = 40.0; // R$ 40
        double baseCO2 = 1.2; // 1.2 kg CO2

        // Adjust CO2 based on conditions
        double co2Multiplier = 1.0;
        
        // Traffic impact on emissions
        switch (conditions.getTraffic()) {
            case LOW: co2Multiplier *= 0.8; break;
            case MEDIUM: co2Multiplier *= 1.0; break;
            case HIGH: co2Multiplier *= 1.3; break;
            case HEAVY: co2Multiplier *= 1.5; break;
        }

        // Transport type impact
        switch (conditions.getTransportType()) {
            case CAR: co2Multiplier *= 1.0; break;
            case BUS: co2Multiplier *= 0.4; break;
            case BIKE: co2Multiplier *= 0.0; break;
            case WALK: co2Multiplier *= 0.0; break;
        }

        // Calculate final values
        double finalTime = baseTime;
        double finalDistance = baseDistance;
        double finalCost = baseCost;
        double finalCO2 = baseCO2 * co2Multiplier;

        return new Route(origin, destination, finalTime, finalDistance, finalCost, finalCO2);
    }
}
