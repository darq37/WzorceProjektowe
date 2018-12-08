package com.umcs;

public class DeviceButton {
    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }
}