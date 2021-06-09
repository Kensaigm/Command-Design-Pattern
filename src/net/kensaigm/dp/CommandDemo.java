package net.kensaigm.dp;

// Client
public class CommandDemo {

    public static void main(String args[]){
        Light light = new Light();  // Receiver
        Switch lightSwitch = new Switch(); // Invoker

        Command toggleCommand = new ToggleCommand(light);

        for(int i = 0; i < 3; i++){
            lightSwitch.storeAndExecute(toggleCommand);
        }

    }
}
