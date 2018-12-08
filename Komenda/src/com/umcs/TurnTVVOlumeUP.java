package com.umcs;

public class TurnTVVOlumeUP implements Command {
    public TurnTVVOlumeUP(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;
    }

    ElectronicDevice electronicDevice;

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }
}
