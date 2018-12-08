package com.umcs;

public class TurnTVOn implements Command {
    ElectronicDevice electronicDevice;
    public TurnTVOn(ElectronicDevice newDevice){
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
