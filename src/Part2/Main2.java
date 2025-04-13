package Part2;

public class Main2 {
    public static void main(String[] args) {
            SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
            Light light = new Light();
            Thermostat thermostat = new Thermostat();

            remote.setCommand(1, new TurnOnLightCommand(light));
            remote.setCommand(2, new SetThermostatCommand(thermostat, 22));

            remote.pressButton(1);
            remote.pressButton(2);
            remote.undoButton();
        }
    }