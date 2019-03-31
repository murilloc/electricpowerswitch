package cm.murilloc.electricswitch.semdi;

public class ElectricPowerSwitch {
    public LighBulb lighBulb;
    public boolean on;

    public ElectricPowerSwitch(LighBulb lighBulb) {
        this.lighBulb = lighBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }


    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            lighBulb.torunOff();
            this.on = false;
        } else {
            lighBulb.torunOn();
            this.on = true;
        }
    }

}
