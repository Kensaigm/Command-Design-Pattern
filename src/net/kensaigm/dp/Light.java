package net.kensaigm.dp;

// Receiver
public class Light {

    private boolean isOn = false;

    public void toggle() {
        if(isOn){
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light switched on."); // Call to IoT device
    }

    public void off(){
        System.out.println("Light switched off."); // Call to IoT device
    }
}
