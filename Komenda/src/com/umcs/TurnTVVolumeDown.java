package com.umcs;

public class TurnTVVolumeDown implements Command {
    public TurnTVVolumeDown(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;
    }

    ElectronicDevice electronicDevice;

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }
}
