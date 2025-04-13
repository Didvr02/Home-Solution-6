package Part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SmartHomeRemoteControl {
    private Map<Integer, Command> commandSlots = new HashMap<>();
    private List<Command> history = new ArrayList<>();

    public void setCommand(int slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(int slot) {
        if (commandSlots.containsKey(slot)) {
            commandSlots.get(slot).execute();
            history.add(commandSlots.get(slot));
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            lastCommand.undo();
        }
    }
}