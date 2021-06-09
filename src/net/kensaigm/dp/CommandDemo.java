package net.kensaigm.dp;

// Client
public class CommandDemo {

    public static void main(String args[]){
        Light light = new Light();  // Receiver
        Switch lightSwitch = new Switch(); // Invoker

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);
    }
}
