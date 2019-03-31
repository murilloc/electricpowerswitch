package cm.murilloc.electricswitch;

import cm.murilloc.electricswitch.Devices.Fan;
import cm.murilloc.electricswitch.Devices.LightBulb;
import cm.murilloc.electricswitch.comdi.ElectricPowerSwitch;
import cm.murilloc.electricswitch.comdi.Switch;
import cm.murilloc.electricswitch.comdi.Switchable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElectricswitchApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testPRess() throws Exception {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();

        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }

}
