package cm.murilloc.electricswitch.Devices;

import cm.murilloc.electricswitch.comdi.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: bulb turned off");
    }
}
