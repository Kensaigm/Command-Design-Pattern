package net.kensaigm.dp;

// Invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
