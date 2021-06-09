package net.kensaigm.dp;

// Concrete Command, technical dept
public class OnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }

    public OnCommand(Light light) {
        this.light = light;
    }
}
