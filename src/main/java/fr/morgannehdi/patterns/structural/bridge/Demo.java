package fr.morgannehdi.patterns.structural.bridge;

import fr.morgannehdi.patterns.structural.bridge.devices.Device;
import fr.morgannehdi.patterns.structural.bridge.devices.Radio;
import fr.morgannehdi.patterns.structural.bridge.devices.Tv;
import fr.morgannehdi.patterns.structural.bridge.remotes.AdvancedRemote;
import fr.morgannehdi.patterns.structural.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test a Tv");
        testDevice(new Tv());
        System.out.println("Test a Radio");
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}