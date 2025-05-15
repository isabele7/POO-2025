package Padroes_de_projeto.Strategy;

public class Route {
    private String origin;
    private String destination;
    private double timeInMinutes;
    private double distanceInKm;
    private double costInReais;
    private double co2EmissionsInKg;

    public Route(String origin, String destination, double timeInMinutes, double distanceInKm, 
                double costInReais, double co2EmissionsInKg) {
        this.origin = origin;
        this.destination = destination;
        this.timeInMinutes = timeInMinutes;
        this.distanceInKm = distanceInKm;
        this.costInReais = costInReais;
        this.co2EmissionsInKg = co2EmissionsInKg;
    }

    @Override
    public String toString() {
        return String.format("Rota de %s para %s:\n" +
                           "Tempo estimado: %.1f minutos\n" +
                           "Distância: %.1f km\n" +
                           "Custo: R$ %.2f\n" +
                           "Emissão de CO2: %.1f kg",
                           origin, destination, timeInMinutes, distanceInKm, costInReais, co2EmissionsInKg);
    }
}
