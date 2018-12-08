package com.umcs;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice(); //TV Remote tworzy nowy obiekt w ciele metody getDevice i ustala go jako obciekt klasy ElectronicDevice
        TurnTVOn onCommand = new TurnTVOn(newDevice); // Tworze nowy obiekt komendy do właczania telewizora(telewizor jest tu przekazywany jako nowe urządzenie)

        DeviceButton onPressed = new DeviceButton(onCommand); // tworze nowy przycisk uzywający stworzoną komende
        onPressed.press(); // przyciskam go, uzywajac metody press

        //-----------
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        //----------
        TurnTVVOlumeUP tvVolumeUP= new TurnTVVOlumeUP(newDevice);

        onPressed = new DeviceButton(tvVolumeUP);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //------------
          TV theTV = new TV();
          Radio theRadio = new Radio();
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
        allDevices.add(theRadio);
        allDevices.add(theTV);
        TurnAllOff turnOffDevices =  new TurnAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();




    }
}
