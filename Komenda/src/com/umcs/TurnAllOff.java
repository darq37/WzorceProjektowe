package com.umcs;

import java.util.List;

public class TurnAllOff  implements Command{


    List<ElectronicDevice> theDevices;

    public TurnAllOff (List<ElectronicDevice> newDevices){
        theDevices = newDevices;
    }

    @Override
    public void execute() {

        for (ElectronicDevice device : theDevices){
            device.off();
        }

    }
}
