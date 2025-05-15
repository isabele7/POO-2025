package Padroes_de_projeto.Strategy;

public class RouteConditions {
    public enum WeatherCondition {
        SUNNY, RAINY, CLOUDY, STORMY
    }

    public enum TrafficCondition {
        LOW, MEDIUM, HIGH, HEAVY
    }

    public enum TransportType {
        CAR, BUS, BIKE, WALK
    }

    private WeatherCondition weather;
    private TrafficCondition traffic;
    private TransportType transportType;

    public RouteConditions(WeatherCondition weather, TrafficCondition traffic, TransportType transportType) {
        this.weather = weather;
        this.traffic = traffic;
        this.transportType = transportType;
    }

    public WeatherCondition getWeather() {
        return weather;
    }

    public TrafficCondition getTraffic() {
        return traffic;
    }

    public TransportType getTransportType() {
        return transportType;
    }
} 