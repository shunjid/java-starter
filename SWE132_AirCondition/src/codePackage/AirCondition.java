package codePackage;

public class AirCondition {

    private double Temperature;

    public void AssignValue(String Weather) {
        if (Weather.equalsIgnoreCase("warm")) {
            Temperature = 18.0;
        } else if (Weather.equalsIgnoreCase("cold")) {
            Temperature = 25.0;
        }
    }

    public double getValue() {
        return this.Temperature;
    }
}
