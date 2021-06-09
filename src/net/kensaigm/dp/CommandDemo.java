package net.kensaigm.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Client
public class CommandDemo {

    public static void main(String args[]){
        Light bedroomLight = new Light();  // Receiver
        Light kitchenLight = new Light();  // Receiver
        Switch lightSwitch = new Switch(); // Invoker

        Command toggleCommand = new ToggleCommand(bedroomLight);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
