package net.kensaigm.dp;

// Concrete Command for use of State
public class ToggleCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.toggle();
    }

    public ToggleCommand(Light light) {
        this.light = light;
    }
}
