package com.umcs;

public class TurnTVOff implements Command {
    ElectronicDevice electronicDevice;
    public TurnTVOff(ElectronicDevice newDevice){
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }
}
