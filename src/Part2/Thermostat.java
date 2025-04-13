package Part2;

class Thermostat {
    private int temperature;
    private int previousTemperature;

    public void setTemperature(int temperature) {
        this.previousTemperature = this.temperature;
        this.temperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertTemperature() {
        this.temperature = this.previousTemperature;
        System.out.println("[Thermostat] Reverting to previous temperature");
    }
}